package firstjava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "c:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How stuff works");
		
		//handle auto suggestions
		List<WebElement> allsearch = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total displayed suggestions: "+ allsearch.size());
		
		for(int i=0; i<allsearch.size(); i++) {
			String allSearchText = allsearch.get(i).getText();
			String expectedResult = "how stuff works quiz";
			 
			if(allSearchText.equalsIgnoreCase(expectedResult)) {
				allsearch.get(i).click();
				System.out.println("you have clicked on :"+ expectedResult);
				break;
			}
		}
		

	}

}

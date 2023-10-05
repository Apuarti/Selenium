package firstjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/s?k=decor&ref=nb_sb_noss_2");
		Thread.sleep(2000);
		List<WebElement> checkbox = driver.findElements(By.xpath("//a[contains(@class,'a-link-normal s-navigation-item'"));
		String box = "Sullivans";
		for(int i=0; i<checkbox.size(); i++ ) {
			if(checkbox.get(i).getText().equalsIgnoreCase(box)) {
				checkbox.get(i).click();
				System.out.println(box +"clicked");
				break;
			}
		}  
		Thread.sleep(2000);
		driver.close();
		
		

	}

}

package firstjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BankTest {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		
		WhenAboutUsIsClickedDemoShouldOpen();
		
			

	}
	
	public static void WhenAboutUsIsClickedDemoShouldOpen() throws Exception
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://parabank.parasoft.com/parabank/admin.htm");
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='about.htm']")).click();
		Thread.sleep(3000);
		
		WebElement title= driver.findElement(By.xpath("//h1[@class='title']"));
		String actual=title.getAttribute("innerHTML");
		String expected = "ParaSoft Demo Website";
		Assert.assertEquals(actual, expected);
		
		driver.close();
	}
	

}

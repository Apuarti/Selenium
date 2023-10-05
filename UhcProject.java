package firstjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UhcProject {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallbusiness.uhc.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("heroDg-zipcode")).sendKeys("78681");
		driver.findElement(By.id("heroDg-employeeNum")).sendKeys("20");

		driver.findElement(By.id("heroDg-email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("heroDg-submitButton")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@href='/tx/select-benefits']")).click();
		Thread.sleep(3000);

		driver.navigate().back();
		driver.findElement(By.xpath("//*[@href='/tx/shop/wizard-experience-step1']")).click();

		Thread.sleep(3000);
		WebElement yes = driver.findElement(By.xpath("//div[@class='button-wrapper']/button[1]"));
		yes.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='button-wrapper']/button[2]")).click();
		List<WebElement> element=driver.findElements(By.tagName("a"));
		System.out.println(element.size());
		
		String clr=driver.findElement(By.id("sign-in-button")).getCssValue("color");
		System.out.println(clr);
		
		WebElement act=driver.findElement(By.xpath("//*[@alt='help_icon']"));
		Actions act1= new Actions(driver);
		act1.moveToElement(act).build().perform();
		act1.contextClick(act).build().perform();
		act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		act1.sendKeys(Keys.SHIFT).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		

		

	}

}

package firstjava;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenShotOnFailure2 {
	ScreenShotOnFailure ts1= new ScreenShotOnFailure();
	
	@Test(priority=1)
	public void doLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		ts1.driver=new ChromeDriver();
		ts1.driver.get("https://smallbusiness.uhc.com/tx");
		ts1.driver.manage().window().maximize();
		ts1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ts1.driver.findElement(By.id("heroDg-zipcod")).sendKeys("78681");
		ts1.driver.findElement(By.id("heroDg-employeeNum")).sendKeys("20");
		ts1.driver.findElement(By.id("heroDg-email")).sendKeys("abc@gmail.com");
		ts1.driver.findElement(By.id("heroDg-submitButton")).click();
		
		
	}
	@Test(priority=2)
	public void assertionCheck() {
		System.out.println("checked");
	}
	@AfterMethod
	public void takeScreenShotOnFailure3(ITestResult result) throws Exception {
		ts1.screenShot(result);
		ts1.driver.quit();
		
	}
	


}

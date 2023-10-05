package firstjava;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot1 {

	public static void main(String[] args) throws Exception {
		WebDriver  driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.costco.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//TakesScreenshot ts = (TakesScreenshot) driver;
		WebElement element= driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div[2]/div/div[1]/a/img"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File trgt= new File(".\\screenshots\\costco.png");
		FileUtils.copyFile(src , trgt);
		
		
		driver.close();
		
		
		
		
				
	}

}

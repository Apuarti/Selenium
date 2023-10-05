package firstjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com/ref=nav_logo");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.netflix.com/");
		driver.findElement(By.xpath("//input[@id='id_email_hero_fuji']")).sendKeys("aa@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
		String keys=Keys.chord(Keys.SHIFT, Keys.TAB);
		driver.findElement(By.xpath("//*[@type='submit']")).sendKeys(keys);
		
		
	
		

	}

}

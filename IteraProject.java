package firstjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IteraProject {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Text area practice
		driver.findElement(By.id("name")).sendKeys("Lata");
		driver.findElement(By.xpath("//input[contains(@id,'ph')]")).sendKeys("231415");
		driver.findElement(By.xpath("//input[contains(@id, 'email')]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		driver.findElement(By.id("address")).sendKeys("345 lata rd");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		//radio button
		
		List<WebElement> radio1 = driver.findElements(By.xpath("//input[@name='optionsRadios']"));
		String expectedResult = "Female";
		for(int i = 0; i<radio1.size(); i++) {
			if(radio1.get(i).getAttribute("id").equalsIgnoreCase(expectedResult)) {
				radio1.get(i).click();
				System.out.println(expectedResult + " clicked " );
				break;
			}
			else {
				System.out.println("not found");
			}
		}
		
		//checkBoxes
		
           driver.findElement(By.id("monday")).click();
           System.out.println("moday");
           driver.findElement(By.id("thursday")).click();
           System.out.println("guruwar");
           
           //drop down
           WebElement travelopt = driver.findElement(By.xpath("//select[@class='custom-select']"));
           travelopt.click();
           
           Select options = new Select(travelopt);
           options.selectByIndex(2);
           Thread.sleep(2000);
           System.out.println("spain is selected");
           
           driver.findElement(By.xpath("//label[@for='4years']")).click();
           System.out.println("radio button selected");
           driver.findElement(By.xpath("//label[@for='selenium']")).click();
           driver.findElement(By.xpath("//label[@for='testng']")).click();
           driver.findElement(By.xpath("//label[@for='cucumber']")).click();
           System.out.println("all selected");
           
           driver.findElement(By.xpath("//input[@type='file']")).click();
           Thread.sleep(2000);
           System.out.println("upload file");
           
           
           
           
           
           
		
		driver.close();
		driver.quit();
		
		
	}
	
}

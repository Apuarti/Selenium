package firstjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "c:\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/men-tshirts");
		Thread.sleep(3000);
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//label[contains(@class, 'common-customCheckbox vertical-filters-label')]"));
		String expectedresult = "Tshirt";
		for(int i=0; i< checkbox.size(); i++ ) {
			if(checkbox.get(i).getText().startsWith(expectedresult)) {
				checkbox.get(i).click();
				System.out.println(expectedresult +"clicked");
				break;
				
				
			}
			Thread.sleep(3000);
			driver.close();
			driver.quit();
		}
		
		
			
		
		

	}
	
	 
	 

}


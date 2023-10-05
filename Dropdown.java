package firstjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "c:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.etsy.com/your/account/locale_preferences?from_page=https%3A%2F%2Fwww.etsy.com%2F");
		Thread.sleep(2000);
		List<WebElement> dropdown = driver.findElements(By.xpath("//select[@id='locale-overlay-select-region_code']/option"));
		System.out.println("total dropdown value = " + dropdown.size());
		dropdown.get(7).click();
		Thread.sleep(2000);
		System.out.println(dropdown.get(1).getText());
		System.out.println(dropdown.get(1).isEnabled());
		
		
		

	}

}

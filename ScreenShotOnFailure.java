package firstjava;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class ScreenShotOnFailure {
	WebDriver driver;
	
	public void screenShot(ITestResult result) throws Exception   {
		if(ITestResult.FAILURE == result.getStatus() ) {
			TakesScreenshot ts=(TakesScreenshot) driver;
		
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File("./screenshots/ "+ result.getName()+ ".png"));
		System.out.println(result.getName()+ "method() screenshot captured.");
			
	}
	}

}

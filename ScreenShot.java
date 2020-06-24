package automationProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dibyajyothi\\"
				+ "Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//CREATING EVENT FIRING WEB DRIVER & PASSING DRIVER AS AN ARGUMENT.
		EventFiringWebDriver wb = new EventFiringWebDriver(driver);
		//OR we can also write
		//TakesScreenshot fire = (TakesScreenshot)driver;
		File src = wb.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/dj01.png");
		FileUtils.copyFile(src, dest);
		driver.quit();
	}

}

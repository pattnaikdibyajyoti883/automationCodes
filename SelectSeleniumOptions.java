package automationProject;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectSeleniumOptions {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dibyajyothi\\Downloads\\"
				+ "chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement opt = driver.findElement(By.xpath("//input[@title=\"Search\"]"));
		opt.sendKeys("selenium");
		List<WebElement> options = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
		int count = options.size();
		System.out.println(count);
		for (WebElement wb : options) 
		{
			String s=wb.getText();
			System.out.println(s);
			
		}
}
}

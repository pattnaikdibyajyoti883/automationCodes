package automationProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchSeleniumContextClick {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dibyajyothi\\Downloads\\"
				+ "chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Selenium",Keys.ENTER);
		WebElement target = driver.findElement(By.xpath("//h3[text()='Selenium']"));
		Actions act = new Actions(driver);
		act.doubleClick(target).build().perform();
		
		

	}

}

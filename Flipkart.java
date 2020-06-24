package automationProject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dibyajyothi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("i phone xr",Keys.ENTER);
		Thread.sleep(3000);
		WebElement result = driver.findElement(By.xpath("//span[contains(text(),'Showing')]"));
		String result_span = result.getText();
		String[]gy=result_span.split(" ");
		System.out.println(gy[5]);

	}

}

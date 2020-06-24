package automationProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSamsung {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dibyajyothi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("samsung mobiles",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		WebElement result = driver.findElement(By.xpath("//span[contains(text(),'Showing')]"));
		String result_span = result.getText();
		String[]gy = result_span.split("");
		System.out.println(gy[5]);
		/* After selecting ram size of 6gb */
		WebElement result_updated = driver.findElement(By.xpath("//span[contains(text(),'Showing')]"));
		String updated = result_updated.getText();
		String[]fy = updated.split("");
		System.out.println(fy[5]);
	}

}

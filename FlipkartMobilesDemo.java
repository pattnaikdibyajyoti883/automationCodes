package automationProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMobilesDemo {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dibyajyothi\\Downloads\\"
				+ "chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement target = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		List<WebElement> target_02 = driver.findElements(By.xpath("//a[@title=\"Mobiles\"]/ancestor::li[@class=\"_2GG4xt\"]"));
		for (int i = 0; i < target_02.size(); i++) {
			System.out.println(target_02.get(i).getText());
			
		}
		
		
	}

}
/*
 * OUTPUT Mobiles Mi Realme Samsung Infinix OPPO Apple Vivo Honor Asus Poco X2
 * realme Narzo 10 Infinix Hot 9 IQOO 3 iPhone SE Motorola razr realme Narzo 10A
 * Motorola g8 power lite
 */
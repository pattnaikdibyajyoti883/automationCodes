package automationProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartOffsetDemo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dibyajyothi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Point target = driver.findElement(By.xpath("//span[text()='Electronics']")).getLocation();
		int x = target.getX();
		int y = target.getY();
		Actions act = new Actions(driver);
		act.moveByOffset(x, y).build().perform();
		System.out.println("the x-axis is = " + x);//the x-axis is = 66
		System.out.println("the y-axis is = " + y);//the y-axis is = 56

	}

}

package automationProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemoGenericMethod {

	
	
	private static final WebDriver driver = null;
	private static final WebElement target = null;
	public static void main(String[] args)  throws Exception
	{
		moveToElement(target,driver);

	}
	public static void  moveToElement(WebElement element, WebDriver drive) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dibyajyothi\\Downloads\\"
				+ "chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement target = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		
	}

}

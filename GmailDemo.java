package automationProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dibyajyothi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm="
				+ "false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl="
				+ "default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("dibya@mailinator.com",Keys.ENTER);
		driver.findElement(By.xpath("//span[@class=\"RveJvd snByac\"]")).click();
		//driver.findElement(By.xpath("//div[@class=\"ZFr60d CeoRYc\"]")).click();
		//String errorMessage = driver.findElement(By.xpath("//div[@class=\"o6cuMc\"]")).getText();
		//System.out.println(errorMessage);
		String forgotEmail =
		  driver.findElement(By.xpath("//button[text()='Forgot email?']")).getText();
		  System.out.println(forgotEmail);
		 

	}

}

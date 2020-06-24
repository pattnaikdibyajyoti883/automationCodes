package automationProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadResumeInMonster {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dibyajyothi\\Downloads\\"
				+ "chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("http://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		driver.findElement(By.xpath("//input[@name=\"file\"]")).sendKeys("D:\\SKILLRARY TRAINING\\Resume Dibyajyoti.docx");
	}

}

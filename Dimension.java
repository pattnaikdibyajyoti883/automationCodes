package automationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension {

	/*
	 * public Dimension(int i, int j) { // TODO Auto-generated constructor stub }
	 */

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dibyajyothi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://d38ujozxngp8ds.cloudfront.net");
		driver.manage().window().maximize();
		/* driver.manage().window().setSize(new Dimension(100,200)); */
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("virat.k@mailinator.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Password@skype123");
		driver.findElement(By.xpath("//div[text()='Sign In']")).click();
		System.out.println("Welcome to Factoreal");

	}

}

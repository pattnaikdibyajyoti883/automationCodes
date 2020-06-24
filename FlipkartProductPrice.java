package automationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProductPrice {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dibyajyothi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone XR yellow 64",Keys.ENTER );
		Thread.sleep(1000);
		// for emi price 
		//String s=driver.findElement(By.xpath("//div[text()='Apple iPhone XR (White, 64 GB)']/../../div[2]/div[4]/div[2]")).getText();
		//for getting actual price of phn		
		WebElement price=driver.findElement(By.xpath("//a[@target=\"_blank\"]/descendant::div[@class=\"_1-2Iqu row\"]/descendant::div[@class=\"col col-5-12 _2o7WAb\"]/div/div/div[@class=\"_1vC4OE _2rQ-NK\"]"));
		System.out.println(price.getText());
	}

}

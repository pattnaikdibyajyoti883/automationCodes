package automationProject;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dibyajyothi\\Downloads\\"
				+ "chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Search for your city\"]")).sendKeys("Bengaluru",Keys.ENTER);
		List<WebElement> movieList = driver.findElements(By.xpath("//div[@class=\"sidebar-widget trending-searches\"]"));
		int count = movieList.size();
		for (WebElement wb : movieList) 
		{
			String ml = wb.getText();
			System.out.println(ml);
			
		}
}
}
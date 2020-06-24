package automationProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCDotCom {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dibyajyothi\\Downloads\\"
				+ "chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("https://www.BBC.com/");
		driver.manage().window().maximize();
		List<WebElement> news = driver.findElements(By.xpath("//div[@class=\"most-popular\"]"));
		int count = news.size();
		System.out.println(count);
		for (WebElement wb : news) 
		{
			String s=wb.getText();
			System.out.println(s);
			
		}
		

}
}

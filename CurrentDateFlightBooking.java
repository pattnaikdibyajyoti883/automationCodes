package automationProject;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentDateFlightBooking {

	public static void main(String[] args) throws Throwable
	{
		Date d = new Date();
		String date = d.toString();
		
		String dates[] = date.split(" ");
		String day_0 = dates[2];
		String day = day_0.replaceFirst("0","");
		int month = d.getMonth();
		String year = dates[5];
		System.out.println("The day is " + day);
		System.out.println("The month is " + month);
		System.out.println("The year is " + year);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dibyajyothi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/* driver.findElement(By.id("FromDate")).click(); */
		driver.findElement(By.xpath("//input[@title=\"Depart date\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"monthBlock first\"]/descendant::a[text()='15']")).click();
		System.out.println("Requirement Fulfilled!!!!!!!");
		
	}

}

package automationProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dibyajyothi\\Downloads\\"
				+ "chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Selenium",Keys.ENTER);
		driver.manage().window().maximize();
		//WebElement target = driver.findElement(By.xpath("//h3[text()='Selenium']"));
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		WebElement source = driver.findElement(By.xpath("//img[@alt=\"What is Selenium 4 alpha | selenium 4 new features 2019 | ZenQ\"]"));
		WebElement destination = driver.findElement(By.xpath("//button[@class=\"KXJfe\"]"));
		Actions act = new Actions(driver);
		act.clickAndHold(source).build().perform();
		act.moveToElement(destination).build().perform();
		act.release().build().perform();
		//act.dragAndDrop(source, destination).build().perform();

	}

}

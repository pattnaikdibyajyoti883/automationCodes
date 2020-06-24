package automationProject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartWindowMethodDemo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dibyajyothi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("mi phones",Keys.ENTER);
		WebElement mi = driver.findElement(By.xpath("//div[text()='Mi A2 (Red, 128 GB)']"));
		mi.click();
		System.out.println("the selected MI model is--> "+ mi.getText());
		//the selected MI model is--> Mi A2 (Red, 128 GB)
		String cid = driver.getWindowHandle();
		System.out.println("Single browser session id = " + cid);
		//Single browser session id = CDwindow-36F04159B938F1E8BB1EFAE8BC16ED17
		Set<String> absid = driver.getWindowHandles();
		System.out.println("All browsers session id's = " + absid);
		//All browsers session id's = [CDwindow-36F04159B938F1E8BB1EFAE8BC16ED17, CDwindow-C24EBFFB3F4C90FC99BF0B41DBABF18E]
		//ITERATING TO CAPTURE THE SESSION ID'S
		Iterator<String> itr = absid.iterator();
		System.out.println("After iterating the output is--> " + itr);
		//After iterating the output is--> java.util.LinkedHashMap$LinkedKeyIterator@97e93f1
		//CAPTURING THE PARENT WINDOW SESSION ID-
		String psid = itr.next();
		System.out.println("The parent session id = " + psid);
		//The parent session id = CDwindow-46B2910ED170F3C1B0DA377562AD324F
		//TRANSFERING CONTROL FROM PARENT WINDOW TO CHILD WINDOW
		String url = driver.switchTo().window(cid).getCurrentUrl();
		System.out.println("The current url of child window is = " + url);
		//The current url of child window is = https://www.flipkart.com/search?q=mi%20phones&otracker=search&otracker1=
		//search&marketplace=FLIPKART&as-show=on&as=off
		WebElement miPrice = driver.findElement(By.xpath("(//a[@target=\"_blank\"]/descendant::div[@class=\"_1-2Iqu row\"]/descendant::div[@class=\"col col-5-12 _2o7WAb\"]/div/div/div[@class=\"_1vC4OE _2rQ-NK\"])[1]"));
		String Price = miPrice.getText();
		System.out.println("The price of the selected Mi phone is = " + Price);
		//The price of the selected Mi phone is = ₹13,999
}
}
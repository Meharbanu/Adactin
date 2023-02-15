package selenium_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handles {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Banu_Selenium_Practice\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions ac = new Actions(driver);
		
		WebElement sellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		ac.contextClick(sellers).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		ac.contextClick(Mobiles).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement cust_Service = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		ac.contextClick(cust_Service).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		Set<String> window_ID = driver.getWindowHandles();
		
		String s="Amazon.in Bestsellers: The most popular items on Amazon";
		for (String id : window_ID) 
		{
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
		
		if(!s.equals(driver.switchTo().window(id).getTitle()))
		{
			driver.close();
		}
		}
		
	}
}

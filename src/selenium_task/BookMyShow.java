package selenium_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Banu_Selenium_Practice\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Movies']")).click();
//		driver.findElement(By.xpath("(//div[text()='Tamil'])[3]")).click();
		
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000);");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Thunivu']")).click();
		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		
		driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
		js.executeScript("window.scrollBy(0,3000);");
		
		driver.findElement(By.xpath("//a[@data-display-showtime='09:30 PM']")).click();
//		driver.switchTo().alert().accept();
		
		
//		driver.findElement(By.id("dPopupMsgTitle")).click();
//		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("popQty")).click();
		
		driver.findElement(By.xpath("//li[@id='pop_4']")).click();
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		
		driver.findElement(By.xpath("//div[@id='A_7_014']")).click();
		driver.findElement(By.xpath("//a[@id='btmcntbook']")).click();
		
		
		
	}
	
}

package selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Banu_Selenium_Practice\\Chrome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("banu.mehar@gmail.com");
	driver.findElement(By.cssSelector("#pass")).sendKeys("123@456");
	driver.findElement(By.partialLinkText("Create New")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Create a Page")).click();
	
	
}

}

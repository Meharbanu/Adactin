package selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Task {

	public static void browserLaunch() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Banu_Selenium_Practice\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nasa.gov/nasalive/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@class=\'full  ember-text-field ember-view\']"));
		search.sendKeys("recent");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//input[@class=\'ember-text-field ember-view\'])[3]"));
		button.click();
		Thread.sleep(2000);
		WebElement venusLink = driver.findElement(By.xpath("//a[text()='Venus Air Pressure']"));
		venusLink.click();
		Thread.sleep(2000);
		WebElement submenu = driver.findElement(By.xpath("(//span[@class='block py-0 pl-6 -ml-4 border-l-4'])[4]"));
		submenu.click();
		Thread.sleep(3000);
		WebElement vision = driver.findElement(By.xpath("//span[text()='Visions of the Future']"));
		vision.click();
	
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch();
		
	}
}

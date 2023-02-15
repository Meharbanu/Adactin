package selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Task {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Banu_Selenium_Practice\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions ac = new Actions(driver);
		WebElement sellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		ac.click(sellers).build().perform();

		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		ac.clickAndHold(drag).build().perform();
		Thread.sleep(1000);
		
		ac.dragAndDrop(drag, drop).build().perform();
		

		driver.navigate().to("https://www.myntra.com/");

		WebElement kids = driver.findElement(By.xpath("(//a[@data-type='navElements'])[3]"));

		ac.moveToElement(kids).build().perform();

	}
}

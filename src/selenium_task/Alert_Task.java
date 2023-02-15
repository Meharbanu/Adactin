package selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Task {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Banu_Selenium_Practice\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		

		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'the prompt box')]")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("Banu");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
	}
}

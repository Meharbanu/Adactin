package selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Task {

	public static void browserLaunch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Banu_Selenium_Practice\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mobiles.click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		button.click();
		Thread.sleep(2000);
		

		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Mehar");
		Thread.sleep(2000);
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("Banu");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		email.sendKeys("banu@gmail.com");
		Thread.sleep(2000);
		WebElement reemail = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[4]"));
		reemail.sendKeys("banu@gmail.com");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@data-type='password']"));
		password.sendKeys("123456$");
		
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s=new Select(date);
		s.selectByValue("16");
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1=new Select(month);
		s1.selectByValue("2");
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2=new Select(year);
		s2.selectByValue("1980");
		Thread.sleep(3000);
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		
		WebElement signUp = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		signUp.click();
	
	}
	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch();
	}
}

package selenium_task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Banu_Selenium_Practice\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Jyoshitha");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Jyoshitha143$");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='login_button']")).click();
		
		WebElement location = driver.findElement(By.xpath("//Select[@class='search_combobox']"));
		Select s=new Select(location);
		s.selectByVisibleText("Paris");
		Thread.sleep(2000);
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 =new Select(hotels);
		s1.selectByVisibleText("Hotel Sunshine");
		Thread.sleep(2000);
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s2 =new Select(roomType);
		s2.selectByValue("Super Deluxe");
		Thread.sleep(2000);
		
		WebElement roomNos = driver.findElement(By.name("room_nos"));
		Select s3 =new Select(roomNos);
		s3.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement checkInDate = driver.findElement(By.xpath("(//input[@class='date_pick'])[1]"));
		checkInDate.clear();
		checkInDate.sendKeys("20/01/2023");
		Thread.sleep(2000);
		
		WebElement checkOutDate = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
		checkOutDate.clear();
		checkOutDate.sendKeys("23/01/2023");
		Thread.sleep(2000);
		
		WebElement adultRoom = driver.findElement(By.xpath("//Select[@name='adult_room']"));
		Select s4 =new Select(adultRoom);
		s4.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement childRoom = driver.findElement(By.xpath("//Select[@name='child_room']"));
		Select s5 =new Select(childRoom);
		s5.selectByIndex(1);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='reg_button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(2000);
			
		WebElement firstName = driver.findElement(By.name("first_name"));
		firstName.sendKeys("Mehar");
		Thread.sleep(2000);
		WebElement LastName = driver.findElement(By.name("last_name"));
		LastName.sendKeys("Banu");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("2/37, Swaminathan Nagar 4th Street, Kottivakkam, Chennai-600005");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("4567345612346789");
		
		WebElement ccCardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s6= new Select(ccCardType);
		s6.selectByVisibleText("Master Card");
		Thread.sleep(1000);
		
		WebElement expMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s7= new Select(expMonth);
		s7.selectByValue("12");
		
		Thread.sleep(1000);
		WebElement expYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s8= new Select(expYear);
		s8.selectByValue("2022");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("4567");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Book Now']")).click();

		TakesScreenshot screen= (TakesScreenshot) driver;	
		File f=screen.getScreenshotAs(OutputType.FILE);
		File f1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Banu_Selenium_Practice\\Screenshot\\HotelBooking.png");
		FileUtils.copyDirectory(f, f1);
		
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
	}
}

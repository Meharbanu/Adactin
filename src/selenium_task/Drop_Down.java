package selenium_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Banu_Selenium_Practice\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(2000);

		WebElement single = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select s=new Select(single);
		s.selectByVisibleText("Blue");
		Thread.sleep(3000);
		System.out.println("Available options in single drop down ");
		List<WebElement> options = s.getOptions();
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		WebElement w = s.getFirstSelectedOption();
		System.out.println("\n\nSelected options in the single drop down is : " +w.getText());
		
		WebElement multi = driver.findElement(By.xpath("//select[@name='cars']"));
		Select s1=new Select(multi);
		s1.selectByVisibleText("Audi");
		s1.selectByVisibleText("Saab");
		Thread.sleep(3000);
		System.out.println("======================================\n\n");
		System.out.println("Available options in Multiple Drop Down\n");		
		List<WebElement> options1 = s1.getOptions();
		for(int i=0; i<options1.size(); i++)
		{
			System.out.println(options1.get(i).getText());
		}

		System.out.println("\nSelected options from Multiple Dropdown\n");
		List<WebElement> all = s1.getAllSelectedOptions();
		for(WebElement w1:all)
		{
			System.out.println(w1.getText());
		}
	}
}

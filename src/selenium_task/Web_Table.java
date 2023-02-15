package selenium_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Banu_Selenium_Practice\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		List<WebElement> allDatas = driver.findElements(By.xpath("(//table)[1]/tbody/tr/td"));
		for(int i=0; i<allDatas.size();i++)
		{
			System.out.println(allDatas.get(i).getText());
		}
		
	}
}

package selenium_task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshot_Task {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Banu_Selenium_Practice\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File f1 = screen.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Banu_Selenium_Practice\\Screenshot\\amazon.png");
		FileUtils.copyFile(f1, f);
		}
}

package SeleniumCodes.SeleniumPractiseCodes.locators.basicLocators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagnameLocator 
{
	@Test
	public void tagnameLocator()
	{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.get("https://www.nseindia.com/");
			
			//find a number of input tag present on the webpage
			List<WebElement> searchBox = driver.findElements(By.tagName("input"));
			
			System.out.println(searchBox.size());
	}
}

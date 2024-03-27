package SeleniumCodes.SeleniumPractiseCodes.locators.advanceLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_Using_and 
{
	@Test
	public void partialLinkTextLocator()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.nseindia.com/");
		
		WebElement option = driver.findElement(By.xpath("//input[@id=\"fullName\" and @type=\"text\"]"));
		
	}
}

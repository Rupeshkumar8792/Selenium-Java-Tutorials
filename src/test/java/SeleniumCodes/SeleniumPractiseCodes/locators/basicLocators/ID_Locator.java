package SeleniumCodes.SeleniumPractiseCodes.locators.basicLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ID_Locator 
{
	@Test
	public void idLocator()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/edit");
		
		//syntax 
		/*WebElement element = driver.findElement(By.id("elementID"));*/

		WebElement input = driver.findElement(By.id("fullName"));
		
		//sendkeys
		input.sendKeys("rupesh");
		
		//close the browser
		driver.quit();
		
	}
}

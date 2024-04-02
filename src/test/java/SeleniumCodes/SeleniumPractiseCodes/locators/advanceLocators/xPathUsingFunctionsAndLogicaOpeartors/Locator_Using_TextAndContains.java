package SeleniumCodes.SeleniumPractiseCodes.locators.advanceLocators.xPathUsingFunctionsAndLogicaOpeartors;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_Using_TextAndContains 
{
	
	@Test
	public void xpathUsingTextAndContains()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/test");
		
		WebElement dropdown = driver.findElement(By.xpath("//a[contains(text(),'Drop-Down')]"));
		
		dropdown.click();
	}
	
	
	
	
	
	
	
}

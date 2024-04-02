package SeleniumCodes.SeleniumPractiseCodes.locators.advanceLocators.xPathUsingFunctionsAndLogicaOpeartors;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_Using_OR 
{
	@Test
	public void xpathUsingORFunction()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/frame");
		
		WebElement input = driver.findElement(By.xpath("//input[@name=\"fname\" or @placeholder=\"Enter name\"]"));
		
		input.sendKeys("Rupeshkumar");
	}
}

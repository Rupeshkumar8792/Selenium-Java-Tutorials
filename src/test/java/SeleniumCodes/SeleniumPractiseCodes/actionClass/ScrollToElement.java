package SeleniumCodes.SeleniumPractiseCodes.actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollToElement 
{
	@Test
	private void scrollToElement() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/test");
		
		//WebElement
		WebElement scrollToElement = driver.findElement(By.linkText("Grooming"));
		
		//scroll to element
		Actions obj = new Actions(driver);

	}
}

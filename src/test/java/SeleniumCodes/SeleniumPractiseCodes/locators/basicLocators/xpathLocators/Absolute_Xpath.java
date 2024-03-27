package SeleniumCodes.SeleniumPractiseCodes.locators.basicLocators.xpathLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Absolute_Xpath 
{
	/*Absolute XPath: Specifies the full path of the element from the root node to the target element. 
	 It starts with a single forward slash (/)and navigates through each parent element down to the target element. 
	 It's less recommended due to its fragility.*/
	
	@Test
	private void absolute_Xpath()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.nseindia.com/");
		
		WebElement input = driver.findElement(By.xpath("/html/body/app-root/app-input/section[1]/div/div/div[1]/div/div/div[1]/div/input"));
		

	}
}

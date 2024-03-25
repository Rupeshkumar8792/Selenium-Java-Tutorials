package SeleniumCodes.SeleniumPractiseCodes.inputs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearInput 
{
	@Test
	public void clearInput() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/edit");
		
		//finding webelement
		WebElement input = driver.findElement(By.xpath("//input[@id=\"clearMe\"]"));
		
		//clear method is used to clear the method
		input.clear();
		
		try 
		{
			Thread.sleep(3000);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		driver.quit();
	}
}

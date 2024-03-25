package SeleniumCodes.SeleniumPractiseCodes.inputs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPasteInput 
{
	@Test
	public void copypasteinput()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/edit");
		
		//passing input value using sendkeys method
		WebElement input = driver.findElement(By.xpath("//input[@id=\"fullName\"]"));		
		input.sendKeys("rupeshkumar");
		
		//now select all the input 		
		input.sendKeys(Keys.CONTROL+"a");
		
		//now copy it
		input.sendKeys(Keys.CONTROL+"c");
		
		//not past it to the another input box
		WebElement input2 = driver.findElement(By.xpath("//input[@id=\"join\"]"));
		input2.sendKeys(Keys.CONTROL+"v");
		
	}
}

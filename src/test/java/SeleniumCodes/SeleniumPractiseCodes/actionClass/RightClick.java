package SeleniumCodes.SeleniumPractiseCodes.actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick 
{
	@Test
	public void rightClick() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//WebElement
		WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//right click
		Actions obj = new Actions(driver);
		obj.contextClick(right).build().perform();
		
		try 
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		copy.click();
		
		try 
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().alert().accept();
	}

}

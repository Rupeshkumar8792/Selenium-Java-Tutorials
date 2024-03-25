package SeleniumCodes.SeleniumPractiseCodes.dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectByValue 
{
	
	@Test
	public void selectByValue()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/dropdowns");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"fruits\"]"));
		
		//select by value
		Select obj = new Select(dropdown);
		obj.selectByValue("4");
		
		try 
		{
			Thread.sleep(3000);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		obj.selectByValue("1");
		
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

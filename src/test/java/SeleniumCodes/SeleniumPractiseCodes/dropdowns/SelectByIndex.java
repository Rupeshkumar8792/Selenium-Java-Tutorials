package SeleniumCodes.SeleniumPractiseCodes.dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectByIndex 
{
	@Test
	public void dropdownValueSelectByIndex() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/dropdowns");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"fruits\"]"));
		
		//select class is used to select the options from dropdown
		Select objselect = new Select(dropdown);
		
		//select by visible index
		objselect.selectByIndex(2);
		
		try 
		{
			Thread.sleep(3000);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		//select by visible index
		objselect.selectByIndex(0);
		
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

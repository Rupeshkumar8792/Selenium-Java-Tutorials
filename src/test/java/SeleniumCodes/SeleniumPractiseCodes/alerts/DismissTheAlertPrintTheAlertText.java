package SeleniumCodes.SeleniumPractiseCodes.alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DismissTheAlertPrintTheAlertText 
{
	@Test
	public void dismissTheAlertAndPrintTheAlertText()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/alert");
		
		WebElement alertDismiss = driver.findElement(By.xpath("//button[@id=\"confirm\"]"));	
		alertDismiss.click();
		
		//saving the alert text
		String alertText= driver.switchTo().alert().getText();
		
		//printing the alerts
		System.out.println(alertText);
		
		try 
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().alert().dismiss();
		
		try 
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}
	
}

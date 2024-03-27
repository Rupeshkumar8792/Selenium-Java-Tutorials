package SeleniumCodes.SeleniumPractiseCodes.findTitleandURL;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCurrentURL 
{
	@Test
	public void getCurrentURL()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.nseindia.com/");	
		
		String URL = driver.getCurrentUrl();
		
		System.out.println("URl"+" "+URL);
	}
}

package SeleniumCodes.SeleniumPractiseCodes.assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssert 
{
	@Test
	public void hardAssert()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/dropable");
		
		//storing current url
		String url = driver.getCurrentUrl();
		
		//hard assert
		Assert.assertEquals(url, "https://letcode.in/dropable");
		
		driver.quit();
	}
}

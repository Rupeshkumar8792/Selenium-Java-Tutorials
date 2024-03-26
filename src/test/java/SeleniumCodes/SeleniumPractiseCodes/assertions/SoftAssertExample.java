package SeleniumCodes.SeleniumPractiseCodes.assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertExample 
{
	@Test
	private void softAssert()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/dropable");
		
		//storing current url
		String url = driver.getCurrentUrl();
		
		//soft assert
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(url, "https://letcode.in/dropable");
		
		driver.quit();
		
	}
}

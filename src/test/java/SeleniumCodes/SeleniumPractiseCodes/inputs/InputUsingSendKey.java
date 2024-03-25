package SeleniumCodes.SeleniumPractiseCodes.inputs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputUsingSendKey 
{
	@Test
	public void sendkey()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/edit");
		
		//passing input value using sendkeys method
		WebElement input = driver.findElement(By.xpath("//input[@id=\"fullName\"]"));		
		input.sendKeys("rupeshkumar");
		driver.quit();
	}
}

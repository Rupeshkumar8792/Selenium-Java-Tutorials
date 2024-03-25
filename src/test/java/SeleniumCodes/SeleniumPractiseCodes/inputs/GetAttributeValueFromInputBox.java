package SeleniumCodes.SeleniumPractiseCodes.inputs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeValueFromInputBox 
{
	@Test
	public void retriveAttributeValue()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/edit");
		
		//retrieve attribute value
		WebElement input = driver.findElement(By.xpath("//input[@id=\"dontwrite\"]"));
		
		//we can retrive attribute value using getAttribute() method
		String value = input.getAttribute("value");
		System.out.println(value);
		
		//softassertion
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("value", "This text is readonly");
		driver.quit();
	}
	
}

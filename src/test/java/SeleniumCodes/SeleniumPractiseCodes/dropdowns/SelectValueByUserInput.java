package SeleniumCodes.SeleniumPractiseCodes.dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectValueByUserInput 
{
	@Test
	public void selectSpecificValue()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/dropdowns");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"fruits\"]"));
		
		//print all the options present in the dropdown
		Select obj = new Select(dropdown);
		
		List<WebElement> list = obj.getOptions();
		
		for (WebElement webElement : list) 
		{
			if (webElement.getText().equals("Mango"))
			{
				webElement.click();
			}
		}
		
		driver.quit();
	}

}

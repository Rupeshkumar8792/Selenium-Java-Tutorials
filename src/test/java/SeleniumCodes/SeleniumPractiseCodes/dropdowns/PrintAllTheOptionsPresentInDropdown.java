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

public class PrintAllTheOptionsPresentInDropdown 
{
	@Test
	public void printAllTheOptionsPresentInDropdown() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/dropdowns");

		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"fruits\"]"));
		
		//print all the options
		Select obj = new Select(dropdown);		
		List<WebElement> list = obj.getOptions();
		
		//size 
		System.out.println(list.size());
		
		for (WebElement webElement : list) 
		{
			System.out.println(webElement.getText());
		}
		
		driver.quit();
	}
}

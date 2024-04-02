package SeleniumCodes.SeleniumPractiseCodes.locators.advanceLocators.xPathUsingAxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathUsingFollowingSibling 
{
	@Test
	public void xpathUsingFollowingSibling()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement input = driver.findElement(By.xpath("//td[text()='Jasmine Morgan']//following-sibling::td"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(input.getText());
	}
}

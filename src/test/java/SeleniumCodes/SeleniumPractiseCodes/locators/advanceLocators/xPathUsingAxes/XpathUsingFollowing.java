package SeleniumCodes.SeleniumPractiseCodes.locators.advanceLocators.xPathUsingAxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathUsingFollowing 
{
	@Test
	public void xpathUsingFollowing()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		WebElement input = driver.findElement(By.xpath("//td[text()='Kabul']//following::td"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(input.getText());
	}
}

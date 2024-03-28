package SeleniumCodes.SeleniumPractiseCodes.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandling 
{
	@Test
	public void frames()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/frame");
				
		//switching to frames by ID
		driver.switchTo().frame("firstFr");
		
		//entering firstname 
		WebElement firstName = driver.findElement(By.xpath("//input[@name=\"fname\"]"));
		firstName.sendKeys("Rupeshkumar");
		
		//switching to frames by index
		driver.switchTo().frame(1);
		
		WebElement input = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		input.sendKeys("Keys");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//switching to parent frame
		driver.switchTo().parentFrame();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		firstName.clear();
		
		//returning back to main window using default content method
		driver.switchTo().defaultContent();
		
		String name = driver.findElement(By.xpath("//a[text()='Work-Space']")).getText();
		System.out.println(name);
		
	}
}

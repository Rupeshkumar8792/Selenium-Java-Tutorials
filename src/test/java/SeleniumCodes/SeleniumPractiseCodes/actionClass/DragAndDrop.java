package SeleniumCodes.SeleniumPractiseCodes.actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop
{
	@Test
	public void dragAndDrop()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://letcode.in/dropable");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]//p[@id=\"text\"]"));
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]//p[text()='Drop here']"));
		
		//Action class
		Actions obj = new Actions(driver);
		obj.dragAndDrop(drag, drop).build().perform();
		
		try 
		{
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
		driver.quit();
	}
}

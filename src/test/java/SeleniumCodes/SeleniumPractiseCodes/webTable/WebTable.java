package SeleniumCodes.SeleniumPractiseCodes.webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable 
{
	@Test
	private void webtableHandling()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int rowCount = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
		int colCount = driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();
		
		for(int i =1;i<rowCount;i++)
		{
			for(int j = 1;j<colCount;j++)
			{
				String actual = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				if (actual.equals("Roland Mendel")) 
				{
					System.out.println(i+" "+j);
				}
			}
		}
	}
}

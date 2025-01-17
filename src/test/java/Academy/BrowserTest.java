package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("Hello Guys");
		//System.setProperty("webdriver.chrome.driver", "/Users/enesaydogdu/eclipse-workspace/Automation/chromedriver"); Enes Aydogdu..
		//Azure devops yansicak mi ? .. 
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		//System.setProperty("webdriver.chrome.driver", System.getenv("AGENT_WORKFOLDER") + "/chromedriver");

		WebDriver driver =new ChromeDriver();
		driver.get("https://enesaydogdu2-cdgzc2gchphec2hm.canadacentral-01.azurewebsites.net/webapp/");
		String text =driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
		driver.close();
	
		
		
	}
}

package RealTimeAnnotationsUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public WebDriver driver;
    @BeforeClass
    public void setup()
	{
		driver = new ChromeDriver();
		 driver.get("https://automationplayground.com/crm/");
	}
	
		@AfterClass
		  public void tearDown()
		  {
			  driver.quit();
		  }

	}



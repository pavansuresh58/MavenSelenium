package RealTimeAnnotaionsUse1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass1 {
	
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		 driver = new ChromeDriver();
		 driver.get("https://automationplayground.com/crm/");
	}

	@AfterClass
	  public void teardown()
	  {
		  driver.quit();
	  }
	  
	public static void main(String[] args) 
	{
		

	}

}

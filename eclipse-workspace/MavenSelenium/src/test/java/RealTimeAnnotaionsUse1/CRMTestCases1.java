package RealTimeAnnotaionsUse1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRMTestCases1 extends Baseclass1
{
	
	
  @Test(priority=1)
  public void signInlinkValidation() 
  {
	  driver.findElement(By.linkText("Sign In")).click();
  }
  
  @Test(priority=2)
  public void LoginValidation() 
  {
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
	  
	  Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Login Fail");
	  System.out.println("Login completed");
  }
  
  
  
  
}

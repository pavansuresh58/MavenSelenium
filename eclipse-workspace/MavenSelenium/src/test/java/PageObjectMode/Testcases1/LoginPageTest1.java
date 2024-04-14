package PageObjectMode.Testcases1;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel1.pages.LoginPage1;

public class LoginPageTest1 extends BaseClass1 {
  @Test(priority=1)
  public void verifyUrl()
  {
	  //LoginPage1 lp=new LoginPage1();
	  String url = lp.getUrl();
	  Assert.assertTrue(url.contains("hrmlive"),"Url is invalid");
	  System.out.println("Url is valid: "+url);
  }
  
  @Test(priority=2)
  public void verifyTitle()
  	{
	  String actTitle = lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("OrangeHRM"),"Title is not matched");
	  System.out.println("Title is  matched");
  	}
  
  @Test(priority=3)
  public void verifyLogin()
  {
	  lp.doLogin("Admin", "admin123");
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	  System.out.println("Login Completed");
  }
  
}

package PageObjectMode.Testcases1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModel.NewLoginPage; 

public class NewLoginPageTest extends BaseClass1
{
  @Test(priority=1)
  public void verifyUrl()
  {
	  System.out.println(np.getUrl());
  }
  
  @Test(priority=2)
  public void verifyLogin() 
  {
	 // NewLoginPage1 np = PageFactory.initElements(driver,NewLoginPage1.class);
	  np.doLogin("Admin","admin123");
  }
}

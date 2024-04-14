package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupTestDemo
{
  @Test(priority=1,groups = "SmokeTest")
  public void VerifyUrl() 
  {
	  System.out.println("URL Test: This is smoke test case");
  }
  
  @Test(priority=2,groups = "SmokeTest")
  public void VerifyLink() 
  {
	  System.out.println(" LINK Test : This is smoke test case");
  }
  
  @Test(priority=3,groups = "FunctionalTest")
  public void VerifyLogin() 
  {
	  System.out.println("Login Test: This is Functional test case");
  }
  
  @Test(priority=4,groups = "FunctionalTest")
  public void VerifyTitle() 
  {
	  System.out.println("Title Test: This is Functional test case");
  }
  

  @Test(priority=5,groups = "FunctionalTest")
  public void VerifyLogout() 
  {
	  System.out.println("Logout Test: This is Functional test case");
  }
  
  
  
  
}

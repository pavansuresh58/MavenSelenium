package TestNGDemo1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupTestDemo 
{
  @Test(priority=1,groups="SmokeTest")
  public void verifyUrl() 
  {
	  System.out.println("This is smoke test case");
  }
  
  @Test(priority=2,groups="SmokeTest")
  public void verifyLink() 
  {
	  System.out.println("This is smoke test case");
  }
  
  @Test(priority=3,groups="FunctionalTest")
  public void verifyLogin() 
  {
	  System.out.println("This is Functional test case");
  }
  
  @Test(priority=4,groups="FunctionalTest")
  public void verifyTitle() 
  {
	  System.out.println("This is Functional test case");
  }
  
  @Test(priority=5,groups="FunctionalTest")
  public void verifyLogout() 
  {
	  System.out.println("This is Functional test case");
  }
  
  
  
  
}

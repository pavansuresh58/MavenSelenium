package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG
{
  @Test(priority =1)
  public void hardAssertionTest() 
  {
	  String act ="Selenium WebDriver is WebUI  Automation librabry";
	  
	  //String exp ="Selenium WebDriver is WebUI Automation Librabry";
	  String exp =" WebUI Test";
	  
	  //AssertEquals ()
	// Assert.assertEquals(act, exp,"Fail: Strings are not equal");
	 // System.out.println("Pass: Strings are equal");
	  
	 //AssertTrue
	 // Assert.assertTrue(act.contains(exp),"Fail: Actual string doesnt contains WebUI");
	 // System.out.println("Actual String contains WebUI");
	
	  
	  //AssertFalse
	  Assert.assertFalse(act.contains(exp),"Fail:Actual String not contains WebUI Test ");
	  System.out.println("Pass: Actual String not contains WebUI Test");
	  
	  
	  System.out.println("Hard Assertion is completed!");
  }
 @Test (priority =2)
  public void softAssertionTest() 
 {
	 SoftAssert sf = new SoftAssert();
	 
	 int a=100,b=200;
	 
	 //assertEquals()
	 //sf.assertEquals(a, b,"Fail: Numbers are not equal");
	 //System.out.println("Pass: Numbers are equals");
	 
	 
	// sf.assertTrue(a==b,"Fail: Number are not equals");
	// System.out.println("Pass: Numbers are equals");
	// System.out.println("This is Soft assertion test case");
	// sf.assertAll();
	 
	 
		 System.out.println("Pass: Numbers are not equals");
		 System.out.println("This is Soft assertion test case");
		 sf.assertAll();
	 
  }
  
  		
  
}

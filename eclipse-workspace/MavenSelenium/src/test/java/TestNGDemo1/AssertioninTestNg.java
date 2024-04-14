package TestNGDemo1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertioninTestNg {
  @Test(priority=1)
  public void hardassertionTest() 
  {
	  String act = "Selenium webdriver is web UI automation librabry";
	  String exp = "web UI Test";
	
	  //assertEquals
	 // Assert.assertEquals(act,exp,"Fail:Strings are not equal ");
	  //System.out.println("Pass: Strings are equal");
	  
	  //AssertTrue
	 // Assert.assertTrue(act.contains(exp),"Fail: Actual string doesnot contains webUI");
	  
	  //System.out.println("Actual String contains webui");
	  
	  //asert false
	  Assert.assertFalse(act.contains(exp),"fail: actual string not contains WebIU test");
	  System.out.println("Pass: actual string not contains WebIU test"); 
	  
	  System.out.println("Hard Assertion is completed!"); 
	  
	  
	 
	  
  }
  
  @Test(priority=2)
  public void softassertionTest() 
  {
	  SoftAssert sf = new SoftAssert();
	  
	  int a=100,b=200;
	  
	  //assertEquals()
	  //sf.assertEquals(a, b,"Fail: Number are not equals");
	 
	  //System.out.println("Pass : Number are equals");
	  //System.out.println("This is soft Assertion tese case"); 
	 
	  //sf.assertTrue(a==b,"Fail: Number are not equal");
	  //System.out.println("Pass : Number are equals");
	  //System.out.println("This is soft Assertion tese case"); 
	  
	  Assert.assertFalse(a==b,"Fail: Number are not equal");
	  System.out.println("Pass : Number are equals");
	  System.out.println("This is soft Assertion tese case");
	  sf.assertAll();
	  
	   
  }
}

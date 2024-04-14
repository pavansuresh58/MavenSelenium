package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("This is Register Test!");
  }
  
  @Test(priority=2)
  public void loginTest() 
  {
	  System.out.println("This is Login Test!");
  }
  
  @Test(priority=3)
  public void LogoutTest() 
  {
	  System.out.println("This is Logout Test!");
  }
  
  
  //Annatations
  @BeforeMethod
  public void bMethods()
  {
	  System.out.println("BeforeMethod executes before every test case");
  }
  
  @AfterMethod
  public void aMethod()
  {
	  System.out.println("AfterMethod executes before every test case");
  }
  @BeforeClass
  public void bClass()
  {
	  System.out.println("BeforeClass Executes before only first test case!");
  }
  
  @AfterClass
  public void aClass()
  {
	  System.out.println("AfterClass Executes before only last test case!");
  }
  
  @BeforeTest
  public void bTest()
  {
	  System.out.println("BeforeTest will run before class/All classes!");
  }
  
  @AfterTest
  public void aTest()
  {
	  System.out.println("AfterTest will run after class/All classes!");
  }
  @BeforeSuite
  public void bsuite()
  {
	  System.out.println("BeforeSuite will run before Test!");
  }
  
  @AfterSuite
  public void asuite()	
  {
	  System.out.println("AfterSuite will run after Test!");
  }
  
  
}

package TestNGDemo1;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationDemo {
  @Test(priority=1)
  public void register() 
  {
	  System.out.println("This is register test!");
  }
  
  @Test(priority=2)
  public void logintest() 
  {
	  System.out.println("This is login test!");
  }
  
  @Test(priority=3)
  public void logout() 
  {
	  System.out.println("This is logout test!");
  }
  
  //Annotaitons
  @BeforeMethod
  public void bMethods()
  {
	  System.out.println("BeforeMethod executes before every test case!");
  }
  
  @AfterMethod
  public void aMethods()
  {
	  System.out.println("AfterMethod executes before every test case!");
  }
  
  @BeforeClass
  public void bClass()
  {
	  System.out.println("BeforeClass Executes before only first test case!");
  }
  
  @AfterClass
  public void aClass()
  {
	  System.out.println("AfterClass Executes after only last test case!");
  }
  
  @BeforeTest
  public void bTest()
  {
	  System.out.println("BeforeTest will run  before class/All classes!");
  }
  
  @AfterTest
  public void aTest()
  {
	  System.out.println("AfterTest will run  before class/All classes!");
  }
  
  
  @BeforeSuite
  public void bSuite()
  {
	  System.out.println("BeforeSuite will run  before Test!");
  }
  
  
  @AfterSuite
  public void aSuite()
  {
	  System.out.println("AfterSuite will run  before Test!");
  }
  
  
}




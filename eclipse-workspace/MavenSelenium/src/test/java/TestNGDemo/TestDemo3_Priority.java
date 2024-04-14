package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3_Priority 
{
  @Test (priority=1,description ="This is First test case")
  public void RegisterTest() 
  {
	  System.out.println("This is Register test");
  }
  
  @Test (priority=2,description ="This is Second test case")
  public void LoginTest() 
  {
	  System.out.println("This is Login test");
  }
  
  @Test (priority=3,description ="This is Third test case")
  public void SearchProductTest() 
  {
	  System.out.println("This is SearchProductTest");
  }
  
  @Test (priority=4,description ="This is Fourth test case")
  public void AddToCartTest() 
  {
	  System.out.println("This is AddToCartTest");
  }
  
  
  
  
}

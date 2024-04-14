package TestNGDemo1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3_priority {
  @Test(priority=1,description="This is First test case")
  public void register() 
  {
	  System.out.println("This is register test");
  }
  
  @Test(priority=2,description = "This is Second test case")
  public void logintest()
  {
	  System.out.println("This is login test");
  }
  
  @Test(priority=3,description ="This is Third test case")
  public void searchProductTest()
  {
	  System.out.println("This is searchProduct test");
  }
  
  @Test(priority=4,description="This is Fourth test case")
  public void addtoCart()
  {
	  System.out.println("This is addto Cart");
  }
  
  
}

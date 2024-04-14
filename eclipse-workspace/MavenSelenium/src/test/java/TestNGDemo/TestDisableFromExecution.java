package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDisableFromExecution 
{
  @Test
  public void testcase1() 
  {
	  System.out.println("This is test case1");
  }
  
 @Test
	  public void testcase2() 
	  {
	 System.out.println("This is test case2");
	  }
	  
 @Test(enabled = false)
 		public void testcase3() 
	  {
	 	System.out.println("This is test case3");
	  }
		  
 @Test
 public void testcase4() 
{
	System.out.println("This is test case4");
}
  
}

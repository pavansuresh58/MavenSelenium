package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo4_InvocationCount 
{
  @Test (priority=1)
  public void enrollForTheCourse() 
  {
	  System.out.println("Student Enroll for the course");
  }
  
  @Test (priority=2)
  public void training() 
  {
	  System.out.println("Student get the Training for the course");
  }
  
  @Test (priority=3,invocationCount=3)
  public void placementCall() 
  {
	  System.out.println("Student get the Placements for the course");
  }
  
  
  
  
  
}

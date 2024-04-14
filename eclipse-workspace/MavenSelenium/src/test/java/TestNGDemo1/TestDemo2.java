package TestNGDemo1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestDemo2 {
  @Test(priority=1)
  public void chromeTest() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  System.out.println("Tilte is: "+driver.getTitle());
	  
	 }
  
  @Test  (priority=2)
  public void edgeTest() 
  { 
	  WebDriver driver = new EdgeDriver();
	  driver.get("http://www.amazon.com");
	  System.out.println("Tilte is: "+driver.getTitle());
	  
	 }


}

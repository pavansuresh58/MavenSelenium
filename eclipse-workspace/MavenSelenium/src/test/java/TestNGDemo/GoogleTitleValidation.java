package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTitleValidation {
  @Test
  public void TitleValidation() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  String actTitle = driver.getTitle();
	  
	  Assert.assertEquals(actTitle,"Google","Fail: Title  not matched!");
	  System.out.println("Pass: Title matched!");
  }
}

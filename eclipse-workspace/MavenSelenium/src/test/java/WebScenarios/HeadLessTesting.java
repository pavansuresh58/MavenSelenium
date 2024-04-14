package WebScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting {

	public static void main(String[] args) {
		
	ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		//Create a  Driver session
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		 System.out.println("Google application open");
		
		 
		driver.findElement(By.id("APjFqb")).sendKeys("testNG");
		 System.out.println("In searchbox Testng value searched");
		 
		 List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='G43f7e'][1]//li"));
		
		 
		
		 System.out.println("Total options are:"+list1.size());
		 System.out.println("Capturing the list");
		 
		 
		 for(WebElement i : list1)
		 {
			 System.out.println(i.getText());
			 /*
			 if(i.getText().contains("testng"))
			{
				 i.click();
				 break;
			}
			*/
		 }
	}
}
		 
		
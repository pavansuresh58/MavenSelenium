package WebScenarios1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting {

	public static void main(String[] args) 
		{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
	
		
		//create a session
				WebDriver driver = new ChromeDriver(options);
				
				//open application
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://www.google.com/");
				
				driver.findElement(By.id("APjFqb")).sendKeys("TestNg");
				
				
				List<WebElement> list1 =driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
				
				System.out.println("Total Options are: "+list1.size());
				
				for(WebElement i:list1) {
					System.out.println(i.getText());
					/*if(i.getText().contains("testng"))
					{
						i.click();
						break;
					}*/
				}

	}

}

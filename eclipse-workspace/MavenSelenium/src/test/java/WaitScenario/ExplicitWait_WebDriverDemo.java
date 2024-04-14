package WaitScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper1.Utility;

public class ExplicitWait_WebDriverDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

		//By Locator
		By btn = By.xpath("//button[text()='Start']");
		By text = By.xpath("(//h4)[2]");
		
		Utility.waitForElementClickable(driver,btn).click();
		WebElement ele =Utility.waitForVisibilityOfElement(driver, text);
		System.out.println("Text is: "+ele.getText());
		
		//driver.findElement(By.xpath("//button[text()='Start']")).click();
		//String text = driver.findElement(By.xpath("(//h4)[2]")).getText();
		//System.out.println(text);
		
	}

}

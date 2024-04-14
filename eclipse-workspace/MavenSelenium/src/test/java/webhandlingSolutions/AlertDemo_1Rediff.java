package webhandlingSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo_1Rediff {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//username
		driver.findElement(By.id("login1")).sendKeys("Priyanka");
		
		//Click on btn
		driver.findElement(By.name("proceed")).click();
		
		
		Thread.sleep(2000);
		//Handling Alert
		Alert alt = driver.switchTo().alert();
		System.out.println("Alert text is: "+alt.getText());
		alt.accept();
		
		
		
		
		
		//alert appears
		
		driver.findElement(By.id("password")).sendKeys("test123");
		
		

	}

}

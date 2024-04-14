package WebHandlingSolution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo1_Rediff {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//username
		driver.findElement(By.id("login1")).sendKeys("Priyanka");
		
		//click on button
		driver.findElement(By.name("proceed")).click();
		
		//alert appears
		/*
		 * org.openqa.selenium.UnhandledAlertException: unexpected alert open: 
		 * {Alert text : Please enter your password}
		 */
		//Handling alert - ALert is interface 
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		
		System.out.println("Alert text is: "+alt.getText());
		
		alt.accept();
		//alt.dismiss();
		
		//click on password
		driver.findElement(By.id("password")).sendKeys("test123");

	}

}

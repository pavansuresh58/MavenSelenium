package webhandlingSolutions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
	}
	
	public static void scrollToElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",ele);
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		/*
		 * JavascriptExecutor is interface in selenium to handle JavaScript events 
		 */
		
		//To create new alert
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("alert('I am new Javascript alert')");
		
		Thread.sleep(2000);
		
		//handle alert 
		Alert alt = driver.switchTo().alert();
		System.out.println("Alert text is: "+alt.getText());
		alt.accept();
		
		/*
		 * To get title of the webpage how many ways?
		 * 1.getTitle();
		 * 2.Using JavascriptExecutor
		 */
		
		System.out.println(driver.getTitle());
		
		String title = js.executeScript("return document.title").toString();
		System.out.println("Title is:"+title);
		
		WebElement ele = driver.findElement(By.xpath("(//h2[@class='as-title-block-left'])[4]"));
		js.executeScript("arguments[0].scrollIntoView()",ele);
		
		System.out.println("Page scrolled till the Selected Element");
		
		
		//scrollDown(driver);
		
		//Thread.sleep(2000);
		//scrollUp(driver);
		//Scroll
	//	js.executeScript("window.scrollTo(0,6000)");
	//	System.out.println("Page scroll is done!");
	
		/*
		//To Scroll Till end/height of the page
		js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight)");
		
		System.out.println("Page scroll is done!");
		Thread.sleep(2000);
		
		js.executeAsyncScript("window.scrollTo(document.body.scrollHeight,0)");
	*/
	}

}

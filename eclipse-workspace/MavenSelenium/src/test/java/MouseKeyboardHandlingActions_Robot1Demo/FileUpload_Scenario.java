package MouseKeyboardHandlingActions_Robot1Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FileUpload_Scenario {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		String path = "C:\\Users\\sures\\Downloads\\StarAgileWeekday_Oct23.txt";
		
		// driver.findElement(By.id("file-upload")).sendKeys(path);
		 //upload
		// driver.findElement(By.id("file-submit")).click();
		 
		//Using Robot class paste ctrl+v  copy 
			
		//Transferable File Name declaration
		  	StringSelection contents = new StringSelection(path);
		  	
		  	//Getting toolkit
		  	Toolkit toolKit = Toolkit.getDefaultToolkit();
		  	
		  	//Getting clipboard as file upload window
		  	Clipboard clipBoard = toolKit.getSystemClipboard();
		  	
		  	//Copying string file name to the file upload window
		  	clipBoard.setContents(contents, null);

		  	
		  	WebElement ele = driver.findElement(By.id("file-upload"));
		  	Actions act = new Actions(driver);
		  	act.moveToElement(ele).click().build().perform();
		  	
		  	//ctrl+v 
		  	
		  	Robot rb = new Robot();
		  	
		  	rb.delay(2000);
		  	
		  	rb.keyPress(KeyEvent.VK_CONTROL);
		  	rb.keyRelease(KeyEvent.VK_ENTER);
		
		  	//upload
		  	driver.findElement(By.id("file-submit")).click();
		  	
	}

}

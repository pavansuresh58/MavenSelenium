package helper1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	//JavaScript methods
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	public static void scrollToElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",ele);
	}
	

	
	
	
	//WebDriverWait() = Explicit wait
	
	public static WebElement waitForPresenceOfElement(WebDriver driver,By loc)
	{
		WebDriverWait  obj = new WebDriverWait(driver,Duration.ofSeconds(5));
		 return obj.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	
	public static   WebElement waitForElementClickable(WebDriver driver ,By loc)
	{
		WebDriverWait btnobj = new WebDriverWait(driver,Duration.ofSeconds(5));
		return btnobj.until(ExpectedConditions.elementToBeClickable(loc));
	}

	public static WebElement waitForVisibilityOfElement(WebDriver driver,By loc)
	{
		WebDriverWait  obj = new WebDriverWait(driver,Duration.ofSeconds(5));
		 return obj.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	
	public static boolean waitForUrlContains(WebDriver driver,String url)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.urlContains(url));
		
	}
	
	public static boolean waitForTitleContains(WebDriver driver,String title)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.titleContains(title));
		
	}
	
	
	
	
	//Select based drop down
	public static void selectBasedDropdown(WebElement ele,String Value)
	{
	Select dd=new Select(ele);
	System.out.println("Is DD suppprt multiple selection: "+dd.isMultiple());
	
	List<WebElement> alloptions=dd.getOptions();
	System.out.println("Total Options are: "+alloptions.size());
	
	for(WebElement i:alloptions)
	{
		System.out.println(i.getText());
		if(i.getText().contains(Value))
		{
			i.click();
			break;
		}
	}
	}
}


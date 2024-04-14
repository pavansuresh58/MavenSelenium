package helper;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class utility
{
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
	
	
	//select based drop down 
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		Select dd = new Select(ele);
		
		System.out.println("Is dropdown support multiple selection: "+dd.isMultiple());
		
		List<WebElement> allOptions = dd.getOptions();
		
		System.out.println("Total options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
			
		}
	}
	

}

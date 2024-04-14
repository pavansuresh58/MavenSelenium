package WebScenarios1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helper1.Utility;

public class DropDownAutomation {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		System.out.println(driver.getTitle());
		
		//Identify select based dropdown
		WebElement ele = driver.findElement(By.name("url"));
		
		Utility.selectBasedDropdown(ele, "Baby");
		
		
		/*
		 * When Dropdown is designed with <select>tag
		 * use Select class from selenium
		 */
		/*
		//Select Base
		Select dd = new Select(ele);
		System.out.println("Is dropdown supprots multiple selection: "+dd.isMultiple());
		
		//Single Selection
		dd.selectByIndex(2);
		Thread.sleep(2000);
		dd.selectByVisibleText("Gift Cards");
		Thread.sleep(2000);
		dd.selectByValue("search-alias=office-products");

		//Print all options from the dropdown
		
		List<WebElement> allOptions=dd.getOptions();
		System.out.println(allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Software"))
			{
				i.click();
				break;
			}
			
			}
			*/
		
	}

}

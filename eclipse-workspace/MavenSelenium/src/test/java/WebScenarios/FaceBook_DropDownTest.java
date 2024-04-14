package WebScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helper.utility;

public class FaceBook_DropDownTest {

	//reusable script/method 
	/*
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
	*/
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		// Day dropdown
		WebElement dayele = driver.findElement(By.id("day"));
		
	
		utility.selectBasedDropdown(dayele,"28");
		
		// month dropdown
		WebElement monele = driver.findElement(By.id("month"));
		
		utility.selectBasedDropdown(monele,"Dec");
		
		//Year Dropdown
		
		WebElement yearele = driver.findElement(By.id("year"));
		utility.selectBasedDropdown(yearele,"2010");
		
		
		/*
		

		System.out.println("Is dropdown support multiple selection: "+dd.isMultiple());
		
		List<WebElement> allOptions = dd.getOptions();
		
		System.out.println("Total options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("27"))
			{
				i.click();
				break;
			}
			
		}
		*/
	
		
		
		
		

	}

}

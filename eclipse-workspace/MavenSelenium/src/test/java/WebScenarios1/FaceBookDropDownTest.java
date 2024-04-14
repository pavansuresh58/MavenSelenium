package WebScenarios1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helper.utility;
import helper1.Utility;

public class FaceBookDropDownTest {
	
	//reusable script/method
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

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//dropdown
		WebElement dayele =driver.findElement(By.id("day"));
		
		Utility.selectBasedDropdown(dayele,"27");
		
		//month dropdown 
		WebElement monele=driver.findElement(By.id("month"));
		Utility.selectBasedDropdown(monele,"Dec");
		
		//year dropdown
		WebElement yearele= driver.findElement(By.id("year"));
		Utility.selectBasedDropdown(yearele,"2010");
		
		

	}

}

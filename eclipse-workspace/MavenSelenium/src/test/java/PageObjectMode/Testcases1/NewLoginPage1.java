package PageObjectMode.Testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewLoginPage1 
{
	
	private WebDriver driver;
	
	//initialize driver
	
	public NewLoginPage1(WebDriver driver) //BaseClass
	{
		this.driver=driver;
		
	}
	
	//Locators
	private @FindBy(name="username")
	WebElement un;
	
	private @FindBy(name="password")
	WebElement psw;
	
	private @FindBy(xpath="(//button[@type='submit'])")
			WebElement btn;
	
	//actions
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String username,String password)
	{
		un.sendKeys(username);
		psw.sendKeys(password);
		btn.click();
	}

}

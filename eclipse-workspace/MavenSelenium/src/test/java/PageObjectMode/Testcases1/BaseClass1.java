package PageObjectMode.Testcases1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PageObjectModel1.pages.LoginPage1;
import pageObjectModel.NewLoginPage;

public class BaseClass1 
{
	public WebDriver driver;
	public LoginPage1 lp;
	public NewLoginPage1 np;
	
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp=new LoginPage1(driver);
		//np=new NewLoginPage1(driver);
		np =PageFactory.initElements(driver,NewLoginPage1.class);
	
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	

}

package WaitScenario;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

		//By Locator
		By btn = By.xpath("//button[text()='Start']");
		By text = By.xpath("(//h4)[2]");
		
		//FluentWait 
		
		Wait<WebDriver> wait =new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(5))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(NoSuchElementException.class);
		
		driver.findElement(btn).click();
		String data = wait.until(ExpectedConditions.visibilityOfElementLocated(text)).getText();
		System.out.println(data);

	}

}

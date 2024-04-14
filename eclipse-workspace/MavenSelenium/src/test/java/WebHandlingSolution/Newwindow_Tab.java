package WebHandlingSolution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindow_Tab {

	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com");
		
		System.out.println(driver1.getTitle());
		
		//newTab
		WebDriver driver2 = driver1.switchTo().newWindow(WindowType.TAB);
		driver2.get("https://wwww.facebook.com");
		
		System.out.println("Title is: "+driver2.getTitle());
		
	//New Window
		
		WebDriver driver3=driver1.switchTo().newWindow(WindowType.WINDOW);
		driver3.get("https://www.amazon.com");
		System.out.println(driver3.getTitle());
	}

}

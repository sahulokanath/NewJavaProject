package ActionAndActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWinds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver  driver =new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		
		// open the new Tab
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//open the new window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://text-compare.com/");

	}

}

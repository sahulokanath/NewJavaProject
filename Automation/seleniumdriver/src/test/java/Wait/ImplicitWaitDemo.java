package Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
  
  Definition: Tells WebDriver to wait for a specified amount of time before throwing a NoSuchElementException.
  
  Use Case:  When elements take some time to load but vary slightly across pages.
  
  Limitation: Applies to all elements, but cannot handle dynamic conditions like pop-ups or AJAX calls
  
 */
public class ImplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver  =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

}

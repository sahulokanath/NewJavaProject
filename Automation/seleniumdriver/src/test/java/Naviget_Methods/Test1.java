package Naviget_Methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver  =new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().forward();
		
		driver.navigate().to("https://www.kreditbee.in/");
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		// driver.get()--> accpect  the url
		// navigate().to()--> accpect the url and url type object also

	}

}

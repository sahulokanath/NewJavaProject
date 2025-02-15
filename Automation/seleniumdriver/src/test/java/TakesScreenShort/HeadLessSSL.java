package TakesScreenShort;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions optins = new ChromeOptions();
		optins.setAcceptInsecureCerts(true); //accpect the ssl
		
		WebDriver driver =new ChromeDriver(optins);
		
		driver.get("https://expred.badssl.com/");
		
	
		System.out.println(driver.getTitle());
	}

}

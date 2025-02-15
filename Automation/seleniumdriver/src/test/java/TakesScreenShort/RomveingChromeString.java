package TakesScreenShort;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RomveingChromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions optins = new ChromeOptions();
		
		optins.setExperimentalOption("excludeSwitches",new String[] {"enable-automations"});
		
		WebDriver driver =new ChromeDriver(optins);
		
		driver.get("https://www.google.com/");

	}

}

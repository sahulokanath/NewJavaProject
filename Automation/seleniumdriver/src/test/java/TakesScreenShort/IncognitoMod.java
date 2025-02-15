package TakesScreenShort;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options =new ChromeOptions();
		
		options.addArguments("--incognito");
		
		WebDriver driver =new ChromeDriver(options);
		
		driver.get("https://www.google.com/");

	}

}

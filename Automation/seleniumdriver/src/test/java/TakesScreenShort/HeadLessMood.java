package TakesScreenShort;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessMood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions optins = new ChromeOptions();
		optins.addArguments("--headless=new"); //sting to run headless 

		WebDriver driver = new ChromeDriver(optins);

		driver.get("https://www.google.com/");

		@Nullable
		String actula_title = driver.getTitle();

		if (actula_title.equals("Google")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}

	}

}

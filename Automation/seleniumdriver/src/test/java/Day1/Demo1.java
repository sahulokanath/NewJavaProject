package Day1;

import org.openqa.selenium.chrome.ChromeDriver;

/*
 
 1. Launch browser (chrome)
 2. Open URL
 3. Validate title should be "Your store"
 4. close browser 
 
 */

public class Demo1 {

	public static void main(String[] args) {

		// Launch browser
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com");

		String titale = driver.getTitle();

		if (titale.equals("https://demo.opencart.com")) {

			System.out.println("Title  Is Valid");

		} else {
			System.out.println("Title  Is NotValid");
		}
		
		//driver.close();
		driver.quit();
	}

}

package BrokenLink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkCount {


	public static void main(String[] args) {
		
		/*
		 * 
		 * Link href="https://xyz.com"
		 * 
		 * https://xyz.com --->server --> status code
		 * 
		 * status code <=400 broken link status code >400 not broken link
		 * 
		 */
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		driver.get("https://www.zlti.com/");

		driver.manage().window().maximize();

		List<WebElement> allLink = driver.findElements(By.tagName("a"));

		System.out.println("Total Number Of Links:" + allLink.size());

		int noumberOfbrokenlinks = 0;

		for (WebElement linkElement : allLink) {
			@Nullable
			String hrefvalue = linkElement.getAttribute("href");

			if (hrefvalue == null || hrefvalue.isEmpty()) {
				System.out.println("It is null and empty not possible to check ");
				continue;
			}
			try {

				URL linkurl = new URL(hrefvalue); // converting href to URL

				HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();// open the connection to the
																						// server

				conn.connect();// Connect to the server and sent request for the server
				if (conn.getResponseCode() >= 400) {
					System.err.println(hrefvalue + "======> Broken Link");
					noumberOfbrokenlinks++;
				} else {
					System.out.println(hrefvalue + "========>Not a Broken Link");
				}
			} catch (Exception e) {

			}
		}

	}

}

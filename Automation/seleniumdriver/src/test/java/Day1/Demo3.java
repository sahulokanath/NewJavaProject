package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/page-not-found");

		driver.manage().window().maximize();

		// css selector with id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("TABLATE");

		Thread.sleep(5000);

		// css selector with classname

		driver.findElement(By.cssSelector("input.search-box-text")).clear();

		Thread.sleep(5000);

		// css selector with attribute

		driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys("Tablet");
		
		Thread.sleep(5000);

		// css selector with class and attribute
		driver.findElement(By.cssSelector("input.search-box-text[type=\"text\"]")).clear();
		driver.close();

	}

}

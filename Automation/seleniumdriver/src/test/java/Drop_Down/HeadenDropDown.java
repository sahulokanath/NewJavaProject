package Drop_Down;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadenDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin");
		username.click();

		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys("admin123");
		password.click();

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.cssSelector(
				"body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)"))
				.click();
		Thread.sleep(10000);
		
		driver.findElement(By.cssSelector("div:nth-child(6) div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(1)")).click();

		driver.findElement(By.xpath("(//div[contains(text(),'Chief Financial Officer')])[1]")).click();
	}

}

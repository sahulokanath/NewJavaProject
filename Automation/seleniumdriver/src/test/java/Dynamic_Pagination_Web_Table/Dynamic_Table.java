package Dynamic_Pagination_Web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		
		WebElement user = driver.findElement(By.name("username"));
		user.clear();
		user.sendKeys("demo");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.clear();
		pass.sendKeys("demo");
		
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}

}

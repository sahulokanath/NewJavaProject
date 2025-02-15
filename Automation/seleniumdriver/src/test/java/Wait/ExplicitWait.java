package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/*
  
    Definition: Waits for a specific condition to be true before proceeding
    
    Use Case: Useful for waiting on elements that appear dynamically (e.g., pop-ups, AJAX elements)
    
    Advantages: More efficient as it waits only when needed.

 
 */
public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@class=\"gLFyf\"]")));
		element.sendKeys("Java");
		
		
	}

}

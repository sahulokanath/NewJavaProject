import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		 // if i need to only scroll the page 
		//js.executeScript("window.scrollBy(0,1500)", "");
		
		// if i need to go to specif elements web page till can scroll the page
		WebElement ele = driver.findElement(By.id("menu-item-91766"));
		
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}

}

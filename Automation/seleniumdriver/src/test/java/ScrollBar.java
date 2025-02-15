import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		//js.executeAsyncScript("window.scrollBy(0,3000)", "");

		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//scroll the page elements find
	    WebElement	ele=driver.findElement(By.linkText("merrymoonmary"));

	    js.executeAsyncScript("arguments[0].scrollIntoView();", ele);
	    
	    Thread.sleep(5000);
	    
	    System.out.println(js.executeScript("return window.pageYOffset;"));
	}

}

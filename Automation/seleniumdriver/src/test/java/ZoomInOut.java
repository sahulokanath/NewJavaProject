import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInOut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(5000);	
//		driver.manage().window().minimize();
//		Thread.sleep(5000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("document.body.style.zoom='50%'"); // zoom out 
		Thread.sleep(5000);
		
		js.executeScript("document.body.style.zoom='85%'"); //zoom in
		Thread.sleep(5000);
	}
	

}

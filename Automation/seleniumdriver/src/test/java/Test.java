import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://jazz.net/sandbox01-jts/admin");
		
		
		driver.manage().window().maximize();
		
		
		
		WebElement ele = driver.findElement(By.id("user-id"));
		ele.wait(500);
		
		driver.findElement(By.id("pass-word")).sendKeys("lkjgsdfs");
		
	}
	

}

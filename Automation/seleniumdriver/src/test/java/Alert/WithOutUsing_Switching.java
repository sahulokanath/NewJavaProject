package Alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithOutUsing_Switching 
{

	public static void main(String[] args)
	{
		
		WebDriver driver =new ChromeDriver();

		WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
		
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(myalert.getText());
		myalert.accept();
		
		
	}

}

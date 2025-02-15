package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//button[@onclick=\"myFunctionAlert()\"]")).click();

		Alert myalert = driver.switchTo().alert();

		System.out.println(myalert.getText());

		myalert.accept();


		Thread.sleep(300);
		driver.findElement(By.xpath("//button[@id=\"confirmBtn\"]")).click();

		Alert myalert1 = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert1.dismiss();

		Thread.sleep(300);
		
		driver.findElement(By.xpath("//button[@id=\"promptBtn\"]")).click();

		Alert myalert2 = driver.switchTo().alert();
		myalert2.sendKeys("lock");
		myalert2.accept();
		//myalert2.dismiss();
		System.out.println(myalert.getText());

		driver.close();

	}

}

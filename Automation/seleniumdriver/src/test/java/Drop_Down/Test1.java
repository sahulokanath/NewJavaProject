package Drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.kreditbee.in/signin");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@type='loanCardDetails']//button")).click(); //div[@type='loanCardDetails']

		Thread.sleep(5000);
		driver.findElement(By.className("sc-btzYZH llkdXE")).sendKeys("8908064673");
	}

}

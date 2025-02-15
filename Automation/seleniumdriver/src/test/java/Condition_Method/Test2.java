package Condition_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();

		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

		//System.out.println(logo);

		boolean isDisplayed = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(isDisplayed);
		boolean isEnabled = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(isEnabled);

		boolean isSelected = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println(isSelected);
		
		driver.quit();
	}

}

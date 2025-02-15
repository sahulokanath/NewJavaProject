package PraticeAll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		String url = "https://practice.expandtesting.com/radio-buttons";

		driver.get(url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement radiobutton = driver.findElement(By.xpath("(//input[@type=\"radio\"])[3]"));

		System.err.println(radiobutton.isDisplayed());
		System.err.println(radiobutton.isSelected());
		radiobutton.click();
		System.err.println(radiobutton.isSelected());
		System.err.println(radiobutton.isEnabled());
		WebElement color = driver.findElement(By.xpath("//label[@for=\"yellow\"]"));
		System.err.println(color.getText());
		
		driver.quit();
	}

}

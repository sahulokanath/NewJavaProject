package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver  driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		
		WebElement text = driver.findElement(By.id("name"));
		WebElement radio = driver.findElement(By.id("male"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// using JavascriptExecutor sendkey 
		js.executeScript("arguments[0].setAttribute('value','lokanath')", text);
		
		
		//using JavascriptExecutor click
		js.executeScript("arguments[0].click()", radio);
		
		
	}
	

}

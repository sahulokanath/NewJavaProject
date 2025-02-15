package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{

	public static void main(String[] args) throws InterruptedException 
	{

		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		// using absoult xpath
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Mobile1");
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).clear();
		

		// relative xpath
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")).sendKeys("Mobile2");
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")).clear();
		
		//xpath by attributes
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("Mobile3");
		driver.findElement(By.xpath("//input[@name=\"search\"]")).clear();
		
		// using * with tag name
		driver.findElement(By.xpath("//*[@name=\"search\"]")).clear();
		Thread.sleep(3000);
		driver.close();
	}

}

package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();

		WebElement fram1 = driver.findElement(By.cssSelector("frame[src='frame_1.html']"));
		
		driver.switchTo().frame(fram1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("lock");
		
		driver.switchTo().defaultContent();
		
		//fram2
		WebElement fram2 = driver.findElement(By.cssSelector("frame[src='frame_2.html']"));
		
		driver.switchTo().frame(fram2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("lock");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		//frame3
		
		WebElement fram3=driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
		
		driver.switchTo().frame(fram3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
		//frame inside another frame 
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
		Thread.sleep(5000);
	
		driver.switchTo().defaultContent();
		
		// frame5
		
	   WebElement	fram5=driver.findElement(By.cssSelector("frame[src='frame_5.html']"));
	   
	   driver.switchTo().frame(fram5);
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Google");
	   
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
	   Thread.sleep(5000);
	  boolean displyed = driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
	  System.out.println(displyed);
		driver.close();
	}

}

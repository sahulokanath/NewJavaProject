package TestNG5;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


@Listeners(TestNG5.MyListner.class)
public class Flipkart {
	
	WebDriver driver;

	@BeforeClass
	void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	void Logo() throws InterruptedException
	{
		Thread.sleep(3000);
	    boolean  status=driver.findElement(By.xpath("//img[@title=\"Flipkart\"]")).isDisplayed();
	    AssertJUnit.assertEquals(status, true);
	}
	
	
	@Test(priority=2)
	void testAppurl()
	{
		AssertJUnit.assertEquals(driver.getCurrentUrl(), "//img[@title=\"Flipkart\"]");
	}
	
	
	@Test(priority=3 ,dependsOnMethods= {"testAppurl"})
	void testTital() throws InterruptedException
	{
		Thread.sleep(3000);
		AssertJUnit.assertEquals(driver.getTitle(), "Flipkart");
	}
	
	@AfterClass
	void testDown()
	{
		driver.close();
	}
}

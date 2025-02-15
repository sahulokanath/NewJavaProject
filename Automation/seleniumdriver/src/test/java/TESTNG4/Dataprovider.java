package TESTNG4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	WebDriver driver;
	
	
	@BeforeClass
	void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}
	
	
    @Test (dataProvider="dp")
	void testLogin(String email ,String pwd) {
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys(email);
	    driver.findElement(By.id("input-password")).sendKeys(pwd);
	    
	   boolean myaccount = driver.findElement(By.xpath("(//a[@class=\"list-group-item\"])[4]")).isDisplayed();
	   
	   if(myaccount==true)
	   {
		   driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		   AssertJUnit.assertTrue(true);
	   }
	   else
	   {
		   AssertJUnit.fail();
	   }
	}
	
    @AfterClass
	void termdown()
	{
		driver.close();
	}
	
	@DataProvider(name="dp")
	Object [][] logindata()
	{
		Object data [] [] = {
				
				{"abc@gamil.com","test123"},
				{"lck@gmail.com","test222"},
				{"john@gmail.com","test@422"},
				{"pavanol123@gmail.com","test@123"}
				
		};
		return data;
	}
}

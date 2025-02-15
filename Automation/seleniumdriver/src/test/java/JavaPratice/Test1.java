package JavaPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	 public static void main(String[] args) {
	        WebDriver driver =new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://testautomationpractice.blogspot.com/");
	        
	        WebElement dropdwon = driver.findElement(By.xpath("//select[@id=\"country\"]"));
	        dropdwon.click();
	        Select select =new Select(dropdwon);
	        
	        select.selectByVisibleText("France");
	        
	        System.out.println(dropdwon.getText());
	        
	    }
}

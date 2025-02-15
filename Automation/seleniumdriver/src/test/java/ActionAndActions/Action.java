package ActionAndActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver  =new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		WebElement destop = driver.findElement(By.xpath("(//a[@class=\"nav-link dropdown-toggle\"])[1]"));
		
		WebElement  mac=driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[2]"));
		
		
		// Action is a selenium  package
		Actions act =new Actions(driver);	
		
		//act.moveToElement(destop).moveToElement(mac).click().build().perform();
		
		act.moveToElement(destop).moveToElement(mac).click().perform();
		
	}

}

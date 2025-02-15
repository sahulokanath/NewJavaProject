package ActionAndActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class registerLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize();
		
		WebElement reg = driver.findElement(By.xpath("//a[@href=\"/register?returnUrl=%2F\"]"));
		
		
		Actions  act  =new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(reg).keyUp(Keys.CONTROL).perform();
	}

}

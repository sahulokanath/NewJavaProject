package ActionAndActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBordAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://text-compare.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]")).sendKeys("Welcome");

		Actions act = new Actions(driver);
		
		//select the text

		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

		//Copy the text
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

		//Change the TAB
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

		//past the the text
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	}

}

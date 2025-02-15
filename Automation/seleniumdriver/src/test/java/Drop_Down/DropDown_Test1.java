package Drop_Down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * DropDown Types:-
 * 1. Bootstrap drop down
 * 2. select drop down
 * 3. hidden drop down
 * 
 * select dropdown:-
 *  selectByVisibleText
 *  selectByValue
 *  selectByIndex
 *  
 *  
 */
public class DropDown_Test1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"country\"]"));

		Select drop = new Select(dropdown);

		// drop.selectByVisibleText("United Kingdom");
		// drop.selectByValue("germany");
		// drop.selectByIndex(5);

		List<WebElement> opstions = drop.getOptions();
		System.out.println("List Of Opstions In a Drop Down " + opstions.size());

		for (int i = 0; i < opstions.size(); i++) {
			System.out.println(opstions.get(i).getText());
		}

		System.out.println("-----------------------------------------------------------------------------------------");

		for (WebElement test : opstions) {
			System.out.println(test.getText());
		}
		driver.close();
	}

}

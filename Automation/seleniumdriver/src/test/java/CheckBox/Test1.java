package CheckBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		List<WebElement> checkbox = driver
				.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));

		Thread.sleep(3000);

		// Using for each loop
		for (WebElement box : checkbox) {
			box.click();
		}

		// using for loop
		for (int i = 0; i < checkbox.size(); i++) {
			checkbox.get(i).click();
		}
		
		Thread.sleep(3000);
		
		//Select the first 3 check box 
		
		for(int i=0;i<3;i++)
		{
			checkbox.get(i).click();
		}
		
		Thread.sleep(3000);
		
		for(WebElement box:checkbox)
		{
			if(box.isSelected())
			{
				box.click();
			}
		}
		driver.close();

	}

}

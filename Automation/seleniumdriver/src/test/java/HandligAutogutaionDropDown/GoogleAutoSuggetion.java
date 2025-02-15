package HandligAutogutaionDropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggetion {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		driver.findElement(By.name("q")).sendKeys("selenium");

		Thread.sleep(5000);

		List<WebElement> opstion = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@role=\"option\"]"));

		System.out.println("List Of Option:" + opstion.size());

		for (int i = 0; i < opstion.size(); i++)
		{
			System.out.println(opstion.get(i).getText());

			if (opstion.get(i).getText().equals("selenium")) 
			{
				opstion.get(i).click();
				break;
			}
		}

	}

}

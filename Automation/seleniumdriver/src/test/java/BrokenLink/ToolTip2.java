package BrokenLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/tooltip.html");

		driver.manage().window().maximize();

		WebElement download = driver.findElement(By.id("download_now"));
		

		Actions act = new Actions(driver);

		act.clickAndHold().moveToElement(download);
		act.moveToElement(download).build().perform();

		WebElement ToolTip = driver.findElement(By.xpath("//div[@class=\"box\"]//div//a"));

		String ActualResult = ToolTip.getText();
		
		System.out.println("ActualResult :"+ActualResult);
		String expectedTooltip = "What's new in 3.2";
		
		
		if (ActualResult.equals(expectedTooltip)) 
		{
			System.out.println("Test Pass");
		}

	}

}

package Drop_Down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.apple.com/in/iphone/compare/");

		driver.manage().window().maximize();

		WebElement web = driver.findElement(By.xpath("//select[@id='selector-0']"));

		Select drop = new Select(web);
		
		
		List<WebElement> option = drop.getOptions();
		

		System.out.println(option.size());
		
		
	
		for(WebElement ele:option)
		{
			System.out.println(ele.getText());
		}
		
		driver.findElement(By.xpath("//select[@id=\"selector-0\"]//optgroup//option[@value=\"6SX_xJWQ\"]")).click();
	}

}

package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();

		driver.get("https://demo.opencart.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("search")).sendKeys("mac");
		
		driver.findElement(By.id("logo")).isDisplayed();
		
	//	driver.findElement(By.linkText("Tablets")).click();
		
		
		
		//classname
		List<WebElement> links = driver.findElements(By.className("list-inline-item"));
		
		System.out.println("Total Header Links:"+links.size());
		
		//tagname
		
		List<WebElement> tagname = driver.findElements(By.tagName("img"));
		
		System.out.println("List of TagName:"+tagname.size());
		
		
		driver.close();
		
		
	}

}

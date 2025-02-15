package Naviget_Methods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleBowserWindow {

	public static void main(String[] args)
	{
 
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		
		
		// Approach1
		Set<String> windowIDs = driver.getWindowHandles(); // Interface dont have the get method so we are converting to List and using list interface 
		
		List<String> listWinds= new ArrayList(windowIDs);
		
		String parentID = listWinds.get(0);
		String childID = listWinds.get(1);
		
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());

		
		// Approach2
		
		for (String windID :windowIDs)
		{
			@Nullable
			String titalpage = driver.switchTo().window(windID).getTitle();
			
			if(titalpage.equals("OrangeHRM") || titalpage.equals("Some thing elase"))
			{
				System.out.println(driver.getTitle());
				
				driver.close();
				
				//validation here we will write if the it is matching 
			}
		}

	}
	

}

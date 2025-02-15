package HandligAutogutaionDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.bjs.com/");
		
		
		driver.findElement(By.name("search")).sendKeys("water");
		
		Thread.sleep(5000);
		 List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"SearchSuggestion__StyledSearchSuggestion-sc-22jw34-0 eFqbob\"]//a[@auto-data=\"searchBar_searchRedirectedPage\"]"));
		
		 System.out.println(list.size());
		 
		 for(int i=0;i<list.size();i++)
		 {
			 System.out.println(list.get(i).getText());
			 
			 if(list.get(i).getText().equals("water bottle"))
			 {
				 list.get(i).click();
				 break;
			 }
		 }
	}

}

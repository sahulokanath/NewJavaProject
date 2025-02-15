package DatePicker;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://dummy-tickets.com/buyticket");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//a[normalize-space()='Both'])[1]")).click();

		driver.findElement(By.xpath("(//input[@name=\"departure[]\"])[4]")).click();

		String date = "23";
		String year = "2025";
		String month = "jan";
		
		Thread.sleep(5000);

		while (true) {
			String dropyear = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]")).getText();
			String dropmonth = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]")).getText();

		
			if(dropyear.equals(year) && dropmonth.equals(month))
			{
				break;
			}
			driver.findElement(By.xpath("//a[@class=\"ui-datepicker-next ui-corner-all\"]")).click();
			
		}
		
		List<WebElement> dropdate = driver
				.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a"));
		
		for(WebElement dat:dropdate)
		{
			if(dat.getText().equals(date))
			{
				dat.click();
				break;
			}
		}
		 
	}

}

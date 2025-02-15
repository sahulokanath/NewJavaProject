package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {

	static void setyearmonthFututer(WebDriver driver, String year, String month) {
		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();

			String currentYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		}
	}
	static void setyearmonthPast(WebDriver driver, String year, String month) {
		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();

			String currentYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
		}
	}

	static void setdate(WebDriver driver, String date)
	{
		List<WebElement> allDate = driver.findElements(By.xpath("//table//tbody//tr//td//a"));

		for (WebElement date_option : allDate) {
			if (date_option.getText().equals(date)) {
				date_option.click();
				break;
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/datepicker/");

		Thread.sleep(5000);

		driver.switchTo().frame(0);

//		String year="2025";
//		String date="16";
//		String month="January";

		driver.findElement(By.id("datepicker")).click();

		setyearmonthPast(driver,"2023","January");
		setdate(driver,"16");

	}

}

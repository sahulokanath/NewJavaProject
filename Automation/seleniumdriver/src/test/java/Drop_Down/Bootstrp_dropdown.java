package Drop_Down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrp_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		// Select the single element
		driver.findElement(By.xpath("//label[normalize-space()='Java']")).click();

		// capture the list of element present

		List<WebElement> boost_dropdown = driver.findElements(By.xpath("//ul//label"));

		System.out.println("List Of Options:" + boost_dropdown.size());

		// get the list of text
		for (WebElement select_options : boost_dropdown) {
			System.out.println(select_options.getText());
		}

		// select the element
		for (WebElement op : boost_dropdown) {
			String text = op.getText();
			if (text.contains("jQuery") || text.contains("C#") || text.contains("Python")) {
				
				op.click();
			}
		}
		driver.close();
	}

}

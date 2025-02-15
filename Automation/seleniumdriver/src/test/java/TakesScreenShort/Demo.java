package TakesScreenShort;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.diawi.com/");

		driver.manage().window().maximize();

		// Full page screenshot

		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourcefile = ts.getScreenshotAs(OutputType.FILE);

		File targetfile = new File(System.getProperty("user.dir") + "/screenshort/fullpage.png");

		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		
		WebElement product = driver.findElement(By.xpath("(//div[@class='container'])[1]"));

		File sourcefile1 = product.getScreenshotAs(OutputType.FILE);
		File targetfile1 = new File(System.getProperty("user.dir") + "/screenshort/product.png");

		sourcefile1.renameTo(targetfile1);

	}

}

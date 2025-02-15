package TESTNG4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {

	WebDriver driver;

	@BeforeGroups
	@Parameters({"browser"})
	void setup(String br) {

		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("Invalied Broswer");
			return;
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("(//img[@alt=\"OrangeHRM Logo\"])[1]")).isDisplayed();
		AssertJUnit.assertEquals(status, true);
	}

	@Test(priority = 2)

	void testTitle() {
		AssertJUnit.assertEquals(driver.getTitle(), "Human Resources Management Software | OrangeHRM");
	}

	@Test(priority = 3)
	void testUrl() {
		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.orangehrm.com/");
	}

	@AfterClass
	@Test(priority = 4)
	void testEnd() {
		driver.close();
	}

}

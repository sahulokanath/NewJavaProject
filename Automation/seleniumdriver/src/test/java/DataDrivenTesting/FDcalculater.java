package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FDcalculater {

	public static void main(String[] args) throws IOException, InterruptedException {

//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		driver.get("https://groww.in/calculators/fd-calculator");

		driver.manage().window().maximize();

		// why we are creating file path means because every excelutils class first
		// method is file path
		
		String filepath = System.getProperty("user.dir") + "/testdata/Automation.xlsx";

		int rows = ExcelUtils.getRowCout(filepath, "Sheet1");

		for (int i = 0; i <= rows; i++) {
			// read the data from excel sheet
			String Principle = ExcelUtils.getCellData(filepath, "Sheet1", i, 0);

			String Rateofinterest = ExcelUtils.getCellData(filepath, "Sheet1", i, 1);

			String time = ExcelUtils.getCellData(filepath, "Sheet1", i, 2);

			String totalvalue = ExcelUtils.getCellData(filepath, "Sheet1", i, 3);

			String expected = ExcelUtils.getCellData(filepath, "Sheet1", i, 4);

			// Pass the value

			driver.findElement(By.xpath("(//input[@type=\"number\"])[1]")).clear();
			driver.findElement(By.xpath("(//input[@type=\"number\"])[1]")).sendKeys(Principle);

			driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).clear();
			driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys(Rateofinterest);

			driver.findElement(By.xpath("(//input[@type=\"number\"])[3]")).clear();
			driver.findElement(By.xpath("(//input[@type=\"number\"])[3]")).sendKeys(time);

			driver.findElement(By.xpath("//div[@class=\"contentAccent cur-po\"]")).sendKeys(totalvalue);

			// Validation

			String acutal = driver.findElement(By.xpath("(//td[@class=\"right-align\"])[3]")).getText();

			if (Double.parseDouble(acutal) == Double.parseDouble(expected)) {

				System.out.println("Test Pass");
				ExcelUtils.setCellData(filepath, "Sheet1", "Passe", i, 5);
				ExcelUtils.fileGreenColor(filepath, "Sheet1", i, 5);
			} else {
				System.out.println("Test Pass");
				ExcelUtils.setCellData(filepath, "Sheet1", "Passe", i, 5);
				ExcelUtils.fileRedColor(filepath, "Sheet1", i, 5);

			}

			driver.close();

		}
	}
}

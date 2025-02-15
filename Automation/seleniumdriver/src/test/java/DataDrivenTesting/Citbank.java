package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Citbank {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");

		driver.manage().window().maximize();

		String filepath = System.getProperty("user.dir") + "/testdata/Automation.xlsx";

		int rows = ExcelUtils.getRowCout(filepath, "Sheet2");
		
		

		for (int i = 0; i <= rows; i++) {
			// Read the data
			String samount = ExcelUtils.getCellData(filepath, "Sheet2", i, 0);

			String smonth = ExcelUtils.getCellData(filepath, "Sheet2", i, 1);

			String srate = ExcelUtils.getCellData(filepath, "Sheet2", i, 2);

			String scompund = ExcelUtils.getCellData(filepath, "Sheet2", i, 3);

			String sexpected = ExcelUtils.getCellData(filepath, "Sheet2", i, 4);

			WebElement amount = driver.findElement(By.xpath(
					"//input[@class=\"mat-input-element mat-form-field-autofill-control ng-tns-c102-0 ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored\"]"));

			amount.clear();
			amount.sendKeys(samount);

			WebElement month = driver.findElement(By.xpath(
					"//input[@class=\"mat-input-element mat-form-field-autofill-control ng-tns-c102-1 ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored\"]"));

			month.clear();
			month.sendKeys(smonth);

			WebElement interest = driver.findElement(By.xpath(
					"//input[@class=\"mat-input-element mat-form-field-autofill-control ng-tns-c102-2 ng-untouched ng-pristine ng-valid cdk-text-field-autofill-monitored\"]"));

			interest.clear();
			interest.sendKeys(srate);

			Thread.sleep(2000);

			driver.findElement(By.xpath("//div[@class=\"mat-select-arrow-wrapper ng-tns-c109-4\"]")).click();

			List<WebElement> options = driver.findElements(By.xpath("//mat-option[@role=\"option\"]"));


			for (WebElement ele : options) {
				if (ele.getText().contains(scompund)) {
					ele.click();
					break;
				}
			}

			String actula = driver.findElement(By.xpath("//span[@id=\"displayTotalValue\"]")).getText();

			if (Double.parseDouble(sexpected) == Double.parseDouble(actula)) {
				System.out.println("Test Pass");
				ExcelUtils.setCellData(filepath, "Sheet2", "pass", i, 5);
				ExcelUtils.fileGreenColor(filepath, "Sheet2", i, 5);
			} else {
				System.out.println("Test Fail");
				ExcelUtils.setCellData(filepath, "Sheet2", "fail", i, 5);
				ExcelUtils.fileRedColor(filepath, "fail", i, 5);
			}
			driver.close();

		}
	}
}

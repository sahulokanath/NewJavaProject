package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		driver.get("https://groww.in/calculators/fd-calculator");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type=\"number\"])[1]")).clear();
		driver.findElement(By.xpath("(//input[@type=\"number\"])[1]")).sendKeys("10000");

		driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys("10");

		driver.findElement(By.xpath("(//input[@type=\"number\"])[3]")).clear();
		driver.findElement(By.xpath("(//input[@type=\"number\"])[3]")).sendKeys("5");

	}

}

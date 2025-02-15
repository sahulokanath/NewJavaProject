package BrokenLink;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();

		WebElement github = driver.findElement(By.xpath("(//a[@title=\"Github\"])[2]"));

		@Nullable
		String actulresult = github.getAttribute("title");
		
		String ExpectedResult = "Github";
		
		System.out.println("ActulResult:" + actulresult);

		if (actulresult.equals(ExpectedResult)) {
			System.out.println("Test Is Pass");
		}
	}

}

package WebDriver_Methods;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		

		System.out.println("Current Titel"+driver.getTitle());

		@Nullable
		String url = driver.getCurrentUrl();

		System.out.println(url);

		System.out.println(driver.getPageSource());

		// it will give the window id
		String wind = driver.getWindowHandle();
		System.out.println(wind);

		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		// why we have use setlist becase it will identify the uniq id no duplicate
		Set<String> winds = driver.getWindowHandles();

		System.out.println(winds);

		

	}

}

package ActionAndActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();
		
		WebElement bank=driver.findElement(By.xpath("(//li//a[@class=\"button button-orange\"])[5]"));
		
		WebElement placeholer1=driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));

		WebElement amount1 = driver.findElement(By.xpath("(//li//a[@class=\"button button-orange\"])[2]"));
		

		WebElement placeholer2	=driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
		
		WebElement placeholer3 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[4]"));
		
		WebElement placeholer4 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[4]"));
		
		WebElement sales = driver.findElement(By.xpath("(//li//a[@class=\"button button-orange\"])[6]"));
		
		WebElement amount2 = driver.findElement(By.xpath("(//li//a[@class=\"button button-orange\"])[4]"));
		
		
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(bank, placeholer1).perform();
		
		act.dragAndDrop(amount1, placeholer2).perform();
		
		System.out.println("Diposit Have Done Succfully");
		
		Thread.sleep(5000);
		
		act.dragAndDrop(sales, placeholer3).perform();
		
		act.dragAndDrop(amount2, placeholer4).perform();
		
		
	}
	

}

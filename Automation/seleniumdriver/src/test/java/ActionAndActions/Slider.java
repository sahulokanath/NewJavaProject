package ActionAndActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

		driver.manage().window().maximize();
		
		WebElement min_slider = driver.findElement(By.xpath("(//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])[1]"));
		
		WebElement max_slider = driver.findElement(By.xpath("(//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])[2]"));
		
		
		Actions act=new Actions(driver);
		
        System.out.println(min_slider.getLocation());
        
        System.out.println(min_slider.getLocation().getX());
        System.out.println(min_slider.getLocation().getY());
        
        System.out.println(max_slider.getLocation());
		
        
		act.dragAndDropBy(max_slider, -100, 250 ).perform();
		
		act.dragAndDropBy(min_slider, 100, 250).perform();
	}

}

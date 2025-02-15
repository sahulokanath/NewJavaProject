package PraticeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ASPxColorEdit/Example.aspx");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span//img[@class=\"dxtv-btn icon angle-down\" and @alt=\"Collapse\"]")).click();

		driver.findElement(By.id("NavigationPanel_Navigation_NavigationTreeView_N13_8_0")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@id=\"ContentHolder_ColorEditors_ColorEditHeaderFontColor_B-1Img\"]")).click();
		driver.close();
	}

}
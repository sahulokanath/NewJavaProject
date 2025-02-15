package TESTNG6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	
	//Constructor 
	
	LoginPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locator
	
	By text_username_loc=By.xpath("//input[@placeholder='Username']");
	By text_password_loc=By.xpath("//input[@placeholder='Password']");
	By button_login_loc =By.xpath("//button[normalize-space()='Login']");
	
	
	//Action Methods
	
	
	public void setUserName1(String user) {
		// TODO Auto-generated method stub
		driver.findElement(text_username_loc).sendKeys(user);

	}
	
	public void setPassword1(String pwa) {
		// TODO Auto-generated method stub
		driver.findElement(text_password_loc).sendKeys(pwa);

	}

	public void clicklogin() {
		// TODO Auto-generated method stub
		  driver.findElement(button_login_loc).click();	

	}

	

}

package TESTNG6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	WebDriver driver;
	
	//Constructor
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //Mandatory
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_pas;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement button_login;
	
	public void setUserName1(String user) {
		// TODO Auto-generated method stub
		txt_username.sendKeys(user);

	}
	
	public void setPassword1(String pwa) {
		// TODO Auto-generated method stub
		txt_pas.sendKeys(pwa);

	}

	public void clicklogin() {
		// TODO Auto-generated method stub
		button_login.click();	

	}


}

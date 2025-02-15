package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage1 extends BasePage{

	public HomePage1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	@FindBy (xpath="//span[normalize-space()='My Account']")
	WebElement butMyaccount;
	
	@FindBy (xpath="//a[normalize-space()='Register']")
	WebElement butRegister;
	
	@FindBy(linkText="Login")
	WebElement login;

	public void clickMyaccount() {
		butMyaccount.click();
	}
	
	public void clickRegister()
	{
		butRegister.click();
	}


	public void clicklogin() {
		// TODO Auto-generated method stub
		login.click();	
	}

	

	
}

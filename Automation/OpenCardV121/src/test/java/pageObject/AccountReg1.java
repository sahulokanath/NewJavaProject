package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountReg1 extends BasePage{

	public AccountReg1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy (xpath="//input[@id='input-firstname']")
	WebElement txtFirstName;

	@FindBy (xpath="//input[@id='input-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id=\"input-confirm\"]")
	WebElement textConformPassword;
	
	@FindBy(xpath="//input[@id=\"input-telephone\"]")
	WebElement txtTelephone;
	
	@FindBy(xpath="(//input[@name=\"newsletter\"])[1]")
	WebElement butSubscribe;
	@FindBy(xpath="//input[@name=\"agree\"]")
	WebElement butPrivay;
	
	@FindBy (xpath="//input[@value=\"Continue\"]")
	WebElement butContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	
	public void setFirstname(String fname) {
		txtFirstName.sendKeys(fname);
		
	}
	public void setlastName(String lname) {
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String Email) {
		txtEmail.sendKeys(Email);
	}
	
	public void setPassword(String Password) {
		txtPassword.sendKeys(Password);
	}
	
	public void settextConformPassword(String ConformPassword) {
		textConformPassword.sendKeys(ConformPassword);
	}
	
	public void setTxtTelephone(String phone) {
		txtTelephone.sendKeys(phone);
	}
	public void clickbutSubscribe() {
		butSubscribe.click();
	}

	public void clickbutPrivay() {
		butPrivay.click();
	}
	public void clickbutContinue() {
		butContinue.click();
	}
	
	
	public String getConfimationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}
}


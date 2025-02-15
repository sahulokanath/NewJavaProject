package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage {

	public MyAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@class=\"list-group-item\"][normalize-space()=\"My Account\"]")
	WebElement text;

	@FindBy(xpath = "//a[@class=\"list-group-item\"][normalize-space()=\"Logout\"]")
	WebElement butLogout;

	public boolean isMyaccountExist() {
		try {
			return (text.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}

	public void clickLogout() {
		butLogout.click();
	}

}

package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "input-email")
	WebElement textemail;

	@FindBy(id = "input-password")
	WebElement textpass;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement loginbuttn;

	public void setEmail(String email) {

		textemail.sendKeys(email);
	}

	public void setPassword(String pass) {
		textpass.sendKeys(pass);
	}

	public void clicklogin1() {
		loginbuttn.click();
	}
}

package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePage1;
import pageObject.LoginPage;
import pageObject.MyAccount;
import testBase.BaseClass;

public class TC002_Login_page extends BaseClass {

    @Test(groups= {"Sanity","Master"})
    public void verify_login() {
        logger.info("********** Starting Login Test **********");

        try {
            // Navigate to My Account and Login Page
            HomePage1 hp = new HomePage1(driver);
            hp.clickMyaccount();
            hp.clicklogin();

            // Perform Login
            LoginPage lp = new LoginPage(driver);
            lp.setEmail(p.getProperty("email")); // Ensure 'p' is initialized with properties
            lp.setPassword(p.getProperty("password"));
            lp.clicklogin1();

            // Verify Login Success
            MyAccount mc = new MyAccount(driver);
            boolean isLoggedIn = mc.isMyaccountExist();
            Assert.assertTrue(isLoggedIn);

            

        } catch (Exception e) {
            logger.error("Login Test Failed", e); // Log the exception details
            Assert.fail("Login Test Failed due to exception: " + e.getMessage());
            logger.error("Test Failed", e);
        }
        logger.info("********** Login Test Passed **********");
    }
}

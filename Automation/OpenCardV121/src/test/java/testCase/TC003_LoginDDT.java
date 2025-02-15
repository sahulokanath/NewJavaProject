package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePage1;
import pageObject.LoginPage;
import pageObject.MyAccount;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {

    @Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
    public void verify_loginDDT(String email, String pwd, String exp) throws InterruptedException {
        logger.info("------Starting TC003_LoginDDT------");

        try {

            // Navigate to My Account and Login Page
            HomePage1 hp = new HomePage1(driver);
            hp.clickMyaccount();
            hp.clicklogin();

            // Perform Login
            LoginPage lp = new LoginPage(driver);
            lp.setEmail(email);
            lp.setPassword(pwd);
            lp.clicklogin1();

            // Verify Login Success
            MyAccount mc = new MyAccount(driver);
            boolean isLoggedIn = mc.isMyaccountExist();

            if (exp.equalsIgnoreCase("Valid")) {
                if (isLoggedIn) {
                    logger.info("Login successful for valid credentials.");
                    Assert.assertTrue(true, "Login succeeded as expected.");
                    mc.clickLogout(); // Logout if login is successful
                } else {
                    logger.error("Login failed unexpectedly for valid credentials.");
                    Assert.assertTrue(false, "Login failed for valid credentials.");
                }
            } else if (exp.equalsIgnoreCase("Invalid")) {
                if (!isLoggedIn) {
                    logger.info("Login failed as expected for invalid credentials.");
                    Assert.assertTrue(true, "Login failed as expected.");
                } else {
                    logger.error("Login succeeded unexpectedly for invalid credentials.");
                    mc.clickLogout(); // Logout if login succeeds unexpectedly
                    Assert.assertTrue(false, "Login succeeded for invalid credentials.");
                }
            }
        } 
        catch (Exception e) 
        {
            logger.error("Test case failed due to exception: " + e.getMessage(), e);
            Assert.fail("Exception occurred during test execution.");
        }

        Thread.sleep(3000);
        logger.info("------Ending TC003_LoginDDT------");
    }
}

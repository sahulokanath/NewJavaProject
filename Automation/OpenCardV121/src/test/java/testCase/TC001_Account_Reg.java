package testCase;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.AccountReg1;
import pageObject.HomePage1;
import testBase.BaseClass;

public class TC001_Account_Reg extends BaseClass {

    @Test(groups= {"Regression","Master"})
    public void verify_acount_reg() {

        try {

            System.out.println("Starting Logger TC001_Account_Reg Test Case");  // Debugging
            logger.info("Starting Logger TC001_Account_Reg Test Case ");
            HomePage1 acc = new HomePage1(driver);
            acc.clickMyaccount();
            logger.info("Click My Account Link ");
            acc.clickRegister();
            logger.info("Click on Register link");
            
            AccountReg1 homepage = new AccountReg1(driver);

            String password = randAlphaNumeric();
            logger.info("Providing Customer Details");
            homepage.setFirstname(randString().toUpperCase());
            homepage.setlastName(randString().toUpperCase());
            homepage.setEmail(randString() + "@gmail.com");
            homepage.setTxtTelephone(randomNumber());
            homepage.setPassword(password);
            homepage.settextConformPassword(password);

            homepage.clickbutSubscribe();
            homepage.clickbutPrivay();
            homepage.clickbutContinue();
            logger.info("Validating Expected Message");
            String conform = homepage.getConfimationMsg();
            AssertJUnit.assertEquals(conform, "Your Account Has Been Created!");

        } catch (Exception e) {
            logger.error("Test Failed", e);
            logger.debug("Debugging Log: " + e.getMessage());
            Assert.fail();
        }

        logger.info("Finished Logger TC001_Account_Reg Test Case ");
        System.out.println("Finished Logger TC001_Account_Reg Test Case");  // Debugging
    }

}
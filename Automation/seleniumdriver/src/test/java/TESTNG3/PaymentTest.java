package TESTNG3;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test (priority=1,groups= {"sanity","regression","functional"})
	void paymentInRupess()
	{
		System.out.println("Payment By Rupess");
	}
	
	@Test (priority=2,groups= {"sanity","regression","functional"})
	void paymentInDoller()
	{
		System.out.println("Payment By Doller");
	}

}

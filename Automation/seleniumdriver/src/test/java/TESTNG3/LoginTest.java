package TESTNG3;

import org.testng.annotations.Test;

public class LoginTest {

	@Test (priority=1,groups= {"sanity"})
	void loginfacebook() 
	{
		System.out.println("Login by FaceBook");
	}
	

	@Test (priority=2,groups= {"sanity"})
	void loginEmail() 
	{
		System.out.println("Login by Email");
	}
	

	@Test (priority=3 ,groups= {"sanity"})
	void loginTwitter() 
	{
		System.out.println("Login by Twitter");
	}
}

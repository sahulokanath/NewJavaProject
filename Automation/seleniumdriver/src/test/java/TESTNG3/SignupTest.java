package TESTNG3;

import org.testng.annotations.Test;

public class SignupTest {

	@Test (priority=1,groups= {"regression"})
	void signupFaceBook()
	{
	 System.out.println("SignUp FaceBook");	
	}
	
	@Test (priority=2,groups= {"regression"})
	void signupEmail() {
		System.out.println("Signup Email");
	}
	
	@Test (priority=3 ,groups= {"regression"})
	void signupTwitter() {
		System.out.println("Signup Twitter");
		
	}
}

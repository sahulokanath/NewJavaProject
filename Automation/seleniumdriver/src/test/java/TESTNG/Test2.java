package TESTNG;

import org.testng.annotations.Test;

public class Test2 {

	void login()
	{
		System.out.println("This is LOGIN");
	}
	
	
	@Test
	void logout()
	{
		System.out.println("This is logout");
	}
}

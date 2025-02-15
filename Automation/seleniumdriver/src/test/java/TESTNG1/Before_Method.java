package TESTNG1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Before_Method {

	
	@BeforeMethod
	void login()
	{
		System.out.println("This is LOGIN");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search");
	}
	
	@Test(priority=2)
	void Adv_search()
	{
		System.out.println("This is Adv_search");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout");
	}
}

package TESTNG1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

	@BeforeTest
	void login()
	{
		System.out.println("This is beforetest");
	}
	@Test
	void C1()
	{
		System.out.println("This is Test Method C1");
	}
}

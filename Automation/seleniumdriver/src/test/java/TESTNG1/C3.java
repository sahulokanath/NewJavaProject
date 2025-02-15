package TESTNG1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

	@Test
	void C3Test()
	{
		System.out.println("This is Test Method C3 ");
	}
	@BeforeSuite
	void Befor()
	{
		System.out.println("This BeforeSuite in C3 class");
	}
	
	@AfterSuite
	void After()
	{
		System.out.println("This AfterSuite in C3 class");
	}
}

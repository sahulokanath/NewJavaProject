package TESTNG1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

	@AfterTest
	void logout() {
		
		System.out.println("This is AfterTest");
	}
	
	@Test
	void C2()
	{
		System.out.println("This is Test Method C2");
	}
}

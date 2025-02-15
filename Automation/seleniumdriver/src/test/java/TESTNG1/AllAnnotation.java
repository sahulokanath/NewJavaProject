package TESTNG1;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AllAnnotation {

	@BeforeTest
	void bm() {
		System.out.println("Before Method");
	}

	@AfterTest
	void am() {
		System.out.println("After Method");
	}

	@BeforeClass
	void bc() {
		System.out.println("Before Class");
	}

	@AfterClass
	void ac() {
		System.out.println("After Class");
	}

	@BeforeSuite
	void bs() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	void as() {
		System.out.println("After Suite");
	}

	@BeforeTest
	void bt() {
		System.out.println("Before Test");
	}

	@AfterTest
	void at() {
		System.out.println("After Test");
	}

	@Test(priority = 1)
	void Test1() {
		System.out.println("Test Method Test1");
	}

	@Test(priority = 2)
	void Test2() {
		System.out.println("Test Method Test2");
	}
}

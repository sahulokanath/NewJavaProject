package TESTNG1;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class Before_Class {

	@BeforeClass
	void login() {
		System.out.println("This is LOGIN");
	}

	@Test(priority = 1)
	void search() {
		System.out.println("This is search");
	}

	@Test(priority = 2)
	void Adv_search() {
		System.out.println("This is Adv_search");
	}

	@AfterClass
	void logout() {
		System.out.println("This is logout");
	}
}

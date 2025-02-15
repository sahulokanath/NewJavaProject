package TestNG5;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener {

	public void onStart(ITestContext context) {

		System.out.println("OnTest Method Start");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test Method Start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Pass");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Fail");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");

	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Method Completed");

	}

}

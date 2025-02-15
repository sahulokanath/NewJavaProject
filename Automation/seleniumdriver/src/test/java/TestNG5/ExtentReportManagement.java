package TestNG5;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManagement implements ITestListener {

    private ExtentSparkReporter sparkReport;  // Used for the UI of the Report
    private ExtentReports extens;  // Populates common info on the report
    private ExtentTest test;  // Creates test case entries in the report and updates the status of the test method

    @Override
    public void onStart(ITestContext context) {
        // Initialize the Spark Reporter and Extent Reports
        sparkReport = new ExtentSparkReporter(System.getProperty("user.dir") + "/report/myreport.html");
        sparkReport.config().setDocumentTitle("Automation Report");
        sparkReport.config().setReportName("Functional Testing");
        sparkReport.config().setTheme(Theme.DARK);

        extens = new ExtentReports();
        extens.attachReporter(sparkReport);

        // Set system info
        extens.setSystemInfo("Computer Name", "localhost");
        extens.setSystemInfo("Environment", "QA");
        extens.setSystemInfo("Tester Name", "Lokanath");
        extens.setSystemInfo("OS", "Windows");
        extens.setSystemInfo("System Name", "Chrome");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Create test entry only if it's null, otherwise reuse the existing test object
        if (test == null) {
            test = extens.createTest(result.getName());  // Create a new entry in the report
        }
        test.log(Status.PASS, "Test case passed: " + result.getName());  // Update status to pass
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Create test entry only if it's null, otherwise reuse the existing test object
        if (test == null) {
            test = extens.createTest(result.getName());  // Create a new entry in the report
        }
        test.log(Status.FAIL, "Test case failed: " + result.getName());  // Update status to fail
        test.log(Status.FAIL, "Failure cause: " + result.getThrowable());  // Log failure cause
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Create test entry only if it's null, otherwise reuse the existing test object
        if (test == null) {
            test = extens.createTest(result.getName());  // Create a new entry in the report
        }
        test.log(Status.SKIP, "Test case skipped: " + result.getName());  // Update status to skip
    }

    @Override
    public void onFinish(ITestContext context) {
        // Check if the ExtentReports object is not null before flushing
        if (extens != null) {
            extens.flush();  // Write the report to the disk
        }
    }
}

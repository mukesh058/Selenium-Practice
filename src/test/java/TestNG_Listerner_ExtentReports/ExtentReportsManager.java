package TestNG_Listerner_ExtentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsManager implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	
	public void onStart(ITestContext context) {
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/Myreport.html");
		sparkReporter.config().setDocumentTitle("Automation Execution Report"); // Set Title of report
		sparkReporter.config().setReportName("Functional test Report");
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("computer name", "localhost");
		
	}
	

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName()); // create entry in report
		test.log(Status.PASS,"The Test case Passed is "+result.getName()); //Update Status 
		
	}

	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "The Test Case failed is "+result.getName());
		test.log(Status.FAIL, "The Test Failed Cause of "+result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "The Test Skipped is "+ result.getName());
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	public void onFinish(ITestContext context) {
		extent.flush();
	}

}

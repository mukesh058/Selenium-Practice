package TestNG_Listerner_ExtentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener implements ITestListener {
	
	
	public void onTestStart(ITestResult result) {
				System.out.println("Started test");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed ...");
	}
	
	
	public void onTestFailure(ITestResult result) {
		System.out.println(" failed test ....");
	}
	
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("Skipped  test ....");
	 }
	 
	 public void onFinish(ITestContext context) {
		 System.out.println("test Execution Complete . ");
	 }

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(" mock test");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test Execution Started ...");
	}
	
	

}

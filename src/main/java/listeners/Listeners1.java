package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;



 
public class Listeners1 implements ITestListener  {

	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test passed with 50%");
	}

			
}

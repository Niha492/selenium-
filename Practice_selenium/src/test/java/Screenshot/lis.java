package Screenshot;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class lis extends scshot implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test case started");
	}

	public void onTestSuccess(ITestResult result) {
	System.out.println("Test case success");
	}

	public void onTestFailure(ITestResult result) {
		try {
			screenshot(result.getMethod().getMethodName()+".png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
	
		System.out.println("test case skipped");
	}

}

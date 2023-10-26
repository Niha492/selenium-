package Screenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerclass extends BaseTest implements ITestListener{
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName());
		captureScreenshot(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName()+".jpg");
	}
}

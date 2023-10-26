package listener1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class invoke implements IInvokedMethodListener {
	WebDriver driver;

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// these implementation is done before test method
		System.out.println("Before Method Invocation" + testResult.getTestClass().getName() + "++>"
				+ method.getTestMethod().getMethodName());
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// these implementation is done after test method
		System.out.println("After Method Invocation" + testResult.getTestClass().getName() + "++>"
				+ method.getTestMethod().getMethodName());
		driver.close();
	}

}

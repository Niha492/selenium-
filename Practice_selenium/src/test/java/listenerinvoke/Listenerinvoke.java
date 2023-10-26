package listenerinvoke;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
public class Listenerinvoke implements IInvokedMethodListener
{
public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
	System.out.println("Before Method Invocation"+testResult.getTestClass().getName()+"++>"+method.getTestMethod().getMethodName());
}

public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
	System.out.println("After Method Invocation"+testResult.getTestClass().getName()+"++>"+method.getTestMethod().getMethodName());
}

}

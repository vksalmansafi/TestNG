package customerlistener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	
	
	public void onTestStart(ITestResult result)

	{
		
		
	}

	public void onTestFailure(ITestResult result) {
		
	  System.out.println("pass the test failure" +result.getName());
		
	}
		


	public void onTestSuccess(ITestResult result) {
		
		System.out.println("pass the test successfully" +result.getName());
		
	}
		

	
	
	
	
	
	
	
}
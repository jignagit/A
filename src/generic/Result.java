package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Result implements ITestListener {

	static int passCount=0,failCount=0;

	

	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+" is pass", true);
		passCount++;
		
	}

	
	public void onTestFailure(ITestResult result) {
		
		String name=result.getName();
		Reporter.log("Test:"+name+" is fail", true);
		failCount++;	
	}

	

	
	
	public void onFinish(ITestContext context) {
		
		Reporter.log("pass:"+passCount, true);
		Reporter.log("fail:"+failCount, true);
		Utility.writeResultToXL("./result/Summary.xlsx", passCount, failCount);
		
		
	}
	//update only above mentioned 3 methods and keep
	//all the other methods as it is
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


}

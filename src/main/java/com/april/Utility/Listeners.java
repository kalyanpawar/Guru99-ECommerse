package com.april.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends Baseclass implements ITestListener{
	
	ExtentReports extent=ExtentReporterclass.getReports();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	
      public void onTestStart(ITestResult result) {
    	  Libraryclass.test = extent.createTest(result.getClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(Libraryclass.test);
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS,"test case pass");	
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL,"test case fail");
		extenttest.get().addScreenCaptureFromBase64String(getscreen());
		
		
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP,"test case skip");
	}

	public void onFinish(ITestContext context) {
		extent.flush();	
	}
	
public String getscreen() {
   String   file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
return file;
}
}


























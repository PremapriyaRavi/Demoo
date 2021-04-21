package org.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class FailedShot extends HelperClass implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
	                                                                                                   	
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		TakesScreenshot tk=(TakesScreenshot)driver;
		//String path="C:\\Users\\PREMA\\eclipse-workspace\\Demo\\Shot";
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des =new File( "./Shot/FailedCase/.png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}

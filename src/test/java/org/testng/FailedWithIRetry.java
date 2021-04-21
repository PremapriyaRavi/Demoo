package org.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedWithIRetry implements IRetryAnalyzer {
	int minCount=1,maxCount=10;
	public boolean retry(ITestResult arg0) {
		if(minCount<maxCount) {
			minCount++;
			return true;
		}
		return false;
	}
}

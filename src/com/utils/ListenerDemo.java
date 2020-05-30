package com.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo extends CommonMethods implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test started" + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed" + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
    System.out.println();	}//  follows Test inside the xml.file

	public void onFinish(ITestContext context) {
	System.out.println();   }//  follows Test inside the xml.file
}

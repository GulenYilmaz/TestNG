package com.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends CommonMethods implements ITestListener {
	@Override
	public void onStart(ITestContext context) {     //---> for xml.file testing
		System.out.println("Functionality xml.file Testing Start");
	}

	@Override
	public void onFinish(ITestContext context) {    //---> for xml.file testing
		System.out.println("Functionality xml.file Testing Finished");
	}

	@Override
	public void onTestStart(ITestResult result) {    //--->for class testing
		System.out.println("Test Started inside the class " + result.getName());
		CommonMethods.takeScreenshot("passed "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {  //--->for class testing
		System.out.println("Test Passed inside the class" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {  //--->for class testing
		System.out.println("Test Failed inside the class" + result.getName());
	}

}
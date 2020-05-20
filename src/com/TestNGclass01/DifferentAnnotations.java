package com.TestNGclass01;

import org.testng.annotations.*;

public class DifferentAnnotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@Test
	public void test() {
		System.out.println("Actual Test Case is running...");
	}

}
	
	
}
/*
 * @BeforeClassThe annotated method will be executed Before any of the test method of a test class.
   @AfterClassThe annotated method will be executed After any of the test method of a test class.
   @BeforeGroupsThe annotated method will be executed Before any of the test method belongs to specified group.
   @AfterGroupsThe annotated method will be executed After any of the test method belongs to specified group.
   @BeforeMethodThe annotated method will be executed Before each test method.@AfterMethodThe annotated method will be executed After each test method.
   @TestMarks a class or a method as a test method. If used at class level, all the public methods of a class will be considered as a test method.
   @DataProviderMarks a method as a data providing method for a test method. The said method has to return an Object double array (Object[ ][ ]) as data.
   @Factory  Marks a annotated method as a factory that returns an array of class objects (Object[ ]). These class objects will then be used as test classes by TestNG. This is used to run a set of test cases with different values.When you wants to execute specific group of test cases with different values, you need to use @Factory annotation@ListenersApplied on a test class. Defines an array of test listeners classes extending org.testng.ITestNGListener. Helps in tracking the execution status and logging purpose.
   @BeforeSuiteThe annotated method will be executed Before any tests declared inside the TestNG suite.
   @AfterSuiteThe annotated method will be executed After any tests declared inside the TestNG suite.
   @BeforeTestThe annotated method will be executed Before test section declared inside the TestNG suite.
   @AfterTestThe annotated method will be executed After test section declared inside the TestNG suite.
 * 
 * 
 * 
 */



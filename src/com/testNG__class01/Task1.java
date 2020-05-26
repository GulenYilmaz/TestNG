package com.testNG__class01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Task 1: Executing different test based TestNG
annotations
 Create class that will have:
 Before and After Class annotation
 Before and After Method annotation
 2 methods with Test annotation
Observe the results!
 */
public class Task1 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is after Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after Method");
	}

	@Test
	public void test1() {
		System.out.println("This is test 1");
	}

	@Test
	public void test2() {
		System.out.println("This is test 2");
	}
}

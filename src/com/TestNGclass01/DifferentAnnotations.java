package com.TestNGclass01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentAnnotations {
// we have to import each methods
	
	@AfterMethod    
	public void afterMethod() {
		System.out.println("After method");
	}
	
	
	
	
	@BeforeMethod   
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	
	
	@Test    //---> this one is the real actual test is running
	public void test() {
		System.out.println("Actual test is running ");
	}
	
	 
	
	
	
}

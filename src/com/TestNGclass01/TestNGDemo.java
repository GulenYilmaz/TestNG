package com.TestNGclass01;
/*Why we use TestNG ?
	* It gives the ability to produce HTMl reports of execution 
	* ( Selenium was running tests but no reports)
	* Annotations made testers life easier
	* Test cases can grouped & prioritized (we can set the execution order) 
	* easly.
	* Parallel testing is possible with TestNG.
    * Batch execution is possible ( means group of tests )
    * Assertation (verification) is possible
    * Data parametiration is possible
    * TestNG can be easliy integrated with many different tools- 
    * Selenium, maven, cucumber etc...
 * 
 * 
 * 
 * 
 * 
 * 
 * Test case writing from TestNG include following steps:
1 Write the Business Logic of Test 
2 Insert TestNG annotations in your Test
3 Add your Test information like - groups, classes,
4 methods and modify it through testng.xml file.
5 Execute TestNG
 * 
 * 
 * 
 */
import org.testng.annotations.Test;

public class TestNGDemo {

	@Test
	public void testOne() {
	System.out.println("Test 1");	
	System.out.println("Test 2");
	System.out.println("Test 3");
	}
	
	@Test
	public void testTwo() {
	System.out.println("Test Case 2");	
	}
	
	@Test
	public void testThree() {
	System.out.println("Test Case 3");	
	}
}

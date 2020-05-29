package com.TestNG__class03__Groups__DataProvider;
/*
 * 
 * Steps to group tests 
	 * 1)define groups inside class
	 * 2)create xml file
	 * 3)in xml file, under name <groups> 
	 * <run>  <include name="sanity"></include>
	 * <run> <groups>
	 * 4) meta groups==we can create custom groups as well
:blob-clap:
7


 * 
 */
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class GroupsDemo {

	// alwaysRun attribute will make sure that this method will always execute
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("afterClass");
	}

	@Test(dependsOnGroups = { "smoke" })
	public void test1() {
		System.out.println("test1");
	}

	@Test(groups = "smoke")
	public void test2() {
		System.out.println("test2");
//		Assert.assertTrue(false); // If this test fails, test1 will be skipped

		SoftAssert soft = new SoftAssert();
		soft.assertTrue(false);
		soft.assertAll(); // this statement will collect all soft assert
							// and decide if test passed or failed
	}

	@Test(groups = { "regression" })
	public void test3() {
		System.out.println("test3");
	}

	@Test(groups = { "smoke", "regression" })
	public void test4() {
		System.out.println("test4");
	}
}

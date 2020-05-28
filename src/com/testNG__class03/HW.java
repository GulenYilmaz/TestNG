package com.testNG__class03;
/*
 * TC 1: HRMS Add Employee: 
 * 1.Open chrome browser
 * 2.Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
 * 3.Login into the application
 * 4.Add 5 different Employees and create login credentials by providing: 
 * First Name
 * Last Name
 * Username
 * Password
 * 5.Provide Employee First and Last Name
 * 6.Verify Employee has been added successfully and take screenshot (you must have 5 different screenshots)
 * 7.Close the browserSpecify group for this test case, add it into specific suite and execute from xml file.
 */


import org.testng.Assert;
import org.testng.annotations.*;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class HW extends CommonMethods {

	@Test(dataProvider = "userData")
	public void test(String firstName, String lastName, String username, String password) {
		// System.out.println(firstName + " " + lastName + " " + username + " " +
		// password);

		// login into HRMS
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));

		// navigate to Add Employee page
		dashboard.navigateToAddEmployee();
		wait(1);

		// add employee information
		sendText(addEmp.firstName, firstName);
		sendText(addEmp.lastName, lastName);
		// get EmployeeID
		String expectedEmpId = addEmp.employeeId.getAttribute("value");

		// click on Create Login Details
		click(addEmp.checkboxLoginDetails);
		wait(1);
		sendText(addEmp.username, username);
		sendText(addEmp.password, password);
		sendText(addEmp.confirmPassword, password);
		wait(1);
		jsClick(addEmp.saveBtn);
		wait(1);

		// validation
		waitForVisibility(pdetails.lblPersonalDetails);
		String actualEmpId = pdetails.employeeId.getAttribute("value");
		Assert.assertEquals(actualEmpId, expectedEmpId, "Employee ID did not match!");

		// take screeshot
		takeScreenshot(firstName + "_" + lastName);
	}

	@DataProvider(name = "userData")
	public Object[][] getData() {
		Object[][] data = {
				{ "Raj", "Capoor", "raj123", "AmirKhan_@123" }, 
				{ "John", "Smith", "john123", "AmirKhan_@123" }, 
				{ "Mary", "Ann", "mary123", "AmirKhan_@123" }, 
				{ "Rohani", "Sakhi", "rohani123", "AmirKhan_@123" },
				{ "Ali", "Tarlaci", "ali123", "AmirKhan_@123" },
		};
		return data;
	}

}
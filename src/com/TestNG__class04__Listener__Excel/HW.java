package com.TestNG__class04__Listener__Excel;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;
import com.utils.ExcelUtility;

public class HW extends CommonMethods {

	@Test(dataProvider = "userDataFromExcel", groups = { "homework", "addEmp", "regression" })
	
	public void test (String firstName, String lastName, String username, String password) {
		// System.out.println(firstName + " " + lastName + " " + username + " " + password);

		
		
		// login into HRMS
		login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
      //login is pageinitializer object . login () is loginPageElements methods
		
		
		// navigate to Add Employee page
		dashboard.navigateToAddEmployee();
		//dashboard is pageinitializer object . navigateToAddEmployee() is dashboardPageElements methods
		wait(1);

		
		
		// add employee information PageInitializer object--addEmpoyeePageElements
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
		
Object[][] data={ //firstname--lastname--username--password
				{ "Raj",   "Capoor", "raj123",   "AmirKhan_@123" },
				{ "John",  "Smith",  "john123",  "AmirKhan_@123" }, 
				{ "Mary",  "Ann",    "mary123",  "AmirKhan_@123" },
				{ "Rohani","Sakhi",  "rohani123","AmirKhan_@123" }, 
				{ "Ali",   "Tarlaci","ali123",   "AmirKhan_@123" }, };
		return data;
	}

	@DataProvider(name = "userDataFromExcel")
	public Object[][] getData2() {
		//return ExcelUtility.excelIntoArray("C:\\Users\\gulen\\eclipse-workspace\\TestNG__2020\\testdata\\test1.xlsx", "Sheet1");
		
	return ExcelUtility.excelIntoArray(System.getProperty("user.dir") + "\\testdata\\test1.xlsx", "Sheet1");
	}

}
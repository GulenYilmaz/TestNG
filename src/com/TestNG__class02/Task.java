package com.TestNG__class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.*;

import com.pages.DashboardPageElements;
import com.pages.LoginPageElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

/*
 *open application
 *verify logo is displayed
 *enter valid credentials 
 *verify user successfully logged in , by verifying welcome message
 */
public class Task extends CommonMethods {// where is baseClasss----> common method class---> we have to extends

	@BeforeMethod
	public void openBrowserAndNavigate() {
		setUp();
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
	
	
	@Test
	public void logoAndWelcomeValidation() {
		LoginPageElements login= new LoginPageElements();
		DashboardPageElements dashboard= new DashboardPageElements();
		
		
		//logo assertion
		boolean logoDisplayed=login.logo.isDisplayed();
		
		Assert.assertTrue(logoDisplayed,"logo is not displayed");
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
		
		//welcome msg assertion
		boolean msgDisplayed=dashboard.welcome.isDisplayed();
		Assert.assertTrue(msgDisplayed);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
//	
//	@Test
//	public void validLogin() throws InterruptedException {
//		WebElement username = driver.findElement(By.id("txtUsername"));
//		username.sendKeys( "Admin");
////		sendText(username, ConfigsReader.getProperty("username"));
//
//		WebElement password = driver.findElement(By.id("txtPassword"));
////		sendText(password, ConfigsReader.getProperty("password"));
//        password.sendKeys("Hum@nhrm123");
//		WebElement loginButton=driver.findElement(By.id("btnLogin"));
//        loginButton.submit();
//		
//        // HW
//		// Validate that Welcome Admin is displayed
//		// Check the reports in test-output folder
//		Thread.sleep(2000);
//
//	}
//	
//	
//	 @Test
//			public void logoValidation() throws Exception {
//				String SyntaxlogoPath = "//img[@alt='OrangeHRM']";
//				WebElement logo = driver.findElement(By.xpath(SyntaxlogoPath));
//				boolean isDisplayed = logo.isDisplayed();
//				if (isDisplayed) {
//					System.out.println("logoValidation passed");
//				} else {
//					System.out.println("logoValidation failed");
//					throw new Exception();
//				}
//				Thread.sleep(2000);
//			}
//
//	
	
	
}

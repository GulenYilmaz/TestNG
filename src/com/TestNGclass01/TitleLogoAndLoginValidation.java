package com.TestNGclass01;
/*
 * Three Test cases
before: open browser, navigate to the website
1. Test Case: Title Validation
after: quit the browser
before: open browser, navigate to the website
2. Test Case: Logo Validation
after: quit the browser
before: open browser, navigate to the website
3. Test Case Valid Login
after: quit the browser
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class TitleLogoAndLoginValidation extends CommonMethods {

	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

	// @Test
	public void titleValidation() throws Exception {
		String expectedTitle = "Human Management System";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("titleValidation passed");
		} else {
			System.out.println("titleValidation failed");
			throw new Exception();
		}
		Thread.sleep(2000);
	}

	// @Test
	public void logoValidation() throws Exception {
		String logoPath = "//div[@id='divLogo']/img";
		WebElement logo = driver.findElement(By.xpath(logoPath));
		boolean isDisplayed = logo.isDisplayed();
		if (isDisplayed) {
			System.out.println("logoValidation passed");
		} else {
			System.out.println("logoValidation failed");
			throw new Exception();
		}
		Thread.sleep(2000);
	}

	@Test
	public void validLogin() throws InterruptedException {
		WebElement username = driver.findElement(By.id("txtUsername"));
//		sendText(username, "Admin");
		sendText(username, ConfigsReader.getProperty("username"));

		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));

		click(driver.findElement(By.id("btnLogin")));

		// HW
		// Validate that Welcome Admin is displayed
		// Check the reports in test-output folder
		Thread.sleep(2000);

	}
}
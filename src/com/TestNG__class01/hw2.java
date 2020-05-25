package com.TestNG__class01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * TC 2: HRMS Application Negative Login:
1. Open chrome browser
2. Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
3. Enter valid username
4. Leave password field empty
5. Verify error message with text “Password cannot be empty” isDisplayed.
 */
public class hw2 {
	WebDriver driver;
	@BeforeMethod
	public void openAndNavigate() throws InterruptedException {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "C:/Users/gulen/eclipse-workspace/TestNG__myTestNG/drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void quitBrowser() {
		driver.close();
	}

	

	@Test
	public void validLogin() throws InterruptedException {
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys( "Admin");
//		sendText(username, ConfigsReader.getProperty("username"));

		WebElement password = driver.findElement(By.id("txtPassword"));
//		sendText(password, ConfigsReader.getProperty("password"));
        password.sendKeys("");
		WebElement loginButton=driver.findElement(By.id("btnLogin"));
        loginButton.submit();
		
        // HW
		// Validate that Welcome Admin is displayed
		// Check the reports in test-output folder
		Thread.sleep(2000);

	}
	
	
	// @Test
		public void logoValidation() throws Exception {
			String PasswordCanNotBeEmpty = "//span[@id='spanMessage']";
			WebElement logo = driver.findElement(By.xpath(PasswordCanNotBeEmpty));
			boolean isDisplayed = logo.isDisplayed();
			if (isDisplayed) {
				System.out.println("PasswordCanNotBeEmpty validation passed");
			} else {
				System.out.println("PasswordCanNotBeEmpty validation failed");
				throw new Exception();
			}
			Thread.sleep(2000);
		}

}

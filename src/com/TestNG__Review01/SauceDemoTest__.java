package com.TestNG__Review01;
/*
		/*
		 *<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
 <test thread-count="5" name="Test">
 <parameter name="username" value="standard_user"/>
 <parameter name="password" value="secret_sauce"/>
  <classes>
   <class name="com.syntax.test.SauceParameterDemo"/>
  </classes>
 </test> <!-- Test -->
</suite> <!-- Suite --> 
		 * 
		 * 
		 */

	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

import com.utils.CommonMethods;

	public class SauceDemoTest__  extends CommonMethods {
		@Parameters ({"username", "password"})
		@Test
		public void loginToSauceDemo(String username, String password) {
			sendText(demosauce.userName, username);
			sendText(demosauce.password, password);
			click(demosauce.LoginBTN);
			wait(2);
		}
		
		
	}


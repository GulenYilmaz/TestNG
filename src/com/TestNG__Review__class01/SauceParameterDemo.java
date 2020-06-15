package com.TestNG__Review__class01;

import org.testng.Assert;
import org.testng.annotations.*;

import com.utils.CommonMethods;

public class SauceParameterDemo extends CommonMethods {
	
		@Test(dataProvider="getData",groups="sprint")
		public void loginToSauceDemo(String username,String password) {
			
			
			Object demosauce;
			sendText(SauceParameterDemo.demosauce.userName, username);
			sendText(SauceParameterDemo.demosauce.password, password);
			click(SauceParameterDemo.demosauce.LoginBTN);
			wait(2);
			
			
			if(username.equals("locked_out_user")) {
				Assert.assertTrue(SauceParameterDemo.demosauce.errorMessage.isDisplayed());
			}else {
				Assert.assertTrue(SauceParameterDemo.demosauce.productLogo.isDisplayed());
			}
			
		}
		@DataProvider(name="getData")
		public Object[][]getData(){
			Object [][] data=new Object[4][2];
			data [0][0]= "standard_user";
			data[0][1]="secret_sauce";
			
			data[1][0]="locked_out_user";
			data[1][1]="secret_sauce";
			
			data[2][0]="problem_user";
			data[2][1]="secret_sauce";
			
			data[3][0]="performance_glitch_user";
			data[3][1]="secret_sauce";
			
			return data;
			
		}
	}
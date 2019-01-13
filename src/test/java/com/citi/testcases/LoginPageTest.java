package com.citi.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.citi.base.TestBase;
import com.citi.page.HomePage;
import com.citi.page.LoginPage;

public class LoginPageTest extends TestBase {
	// import all classes
	HomePage homepage;
	LoginPage loginpage;
	
	// constructor

		public LoginPageTest() {

			super();
		}
		
		@BeforeMethod
		public void setup() {
			initialization();
			loginpage = new LoginPage();

		}
		@Test(priority = 1)

		public void loginPageTitle() {
			String title = loginpage.VerifyTitleofLoginPage();
			Assert.assertEquals(title, "Login - TechFios Test Application - Billing");
		}
		
		@Test(priority = 2)
		public void logoimageTest() {
			boolean logo = loginpage.logo();
			Assert.assertTrue(logo);
		}
		@Test(priority = 3)
		public void fillusername() {
			homepage = loginpage.login1(prop.getProperty("username"), prop.getProperty("password"));

		}
		@AfterMethod
		public void teardown() {
			driver.quit();
		}



}

package com.citi.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.citi.util.TestUtil;
import com.citi.base.TestBase;
import com.citi.page.HomePage;
import com.citi.page.LoginPage;
import com.citi.page.ProductNServicesPage;

public class ProductNServicesTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	ProductNServicesPage productNServices;
	TestUtil testutil;
	String sheetName = "NewServiceInfo";

	public ProductNServicesTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		productNServices = new ProductNServicesPage();
		homepage = loginpage.login1(prop.getProperty("username"), prop.getProperty("password"));

	}

	@DataProvider
	public Object[][] moon() {
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;

	}

	@Test(dataProvider = "moon")
	public void createNewService(String Name, String SalesPrice, String ItemNumber, String Description)
			throws Exception {
		productNServices.newService(Name, SalesPrice, ItemNumber, Description);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}

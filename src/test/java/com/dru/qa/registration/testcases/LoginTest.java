package com.dru.qa.registration.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.dru.qa.registration.base.Testbase;
import com.dru.qa.registration.pages.HomePage;
import com.dru.qa.registration.pages.LoginPage;

public class LoginTest extends Testbase {

	LoginPage loginpage;
	HomePage homepage;

	// Calling Parent class Constructor
	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initiliaze();
		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void validateTitle() {
		String title = loginpage.validateURL();
		Assert.assertEquals(title, "Drucare Pvt Ltd.");
	}

	@Test(priority = 2)
	public void validateLoginPage() {
		boolean flag = loginpage.validateLoginPage();
		Assert.assertTrue(flag, "Login page img not validated");
		
	}

	@Test(priority = 3, groups= {"smoke"})
	public void loginToCredentials() {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"))	;
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

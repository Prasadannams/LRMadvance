package com.dru.qa.registration.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dru.qa.registration.base.Testbase;
import com.dru.qa.registration.pages.HomePage;
import com.dru.qa.registration.pages.LoginPage;
import com.dru.qa.registration.pages.UserManagmentPage;

public class HomePageTest extends Testbase {
	
	LoginPage loginpage;
	HomePage homepage;
	UserManagmentPage usermanagementpage;
	
	public HomePageTest() {
		super();
	}
	

	@BeforeMethod
	public void setup() {
		initiliaze();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		usermanagementpage = new UserManagmentPage();
	}

	@Test(priority=1)
	public void validateMenu() {
		homepage.selectUserScreen();
		
	}
	
	@Test(priority = 2)
	public void validateModule() {
		homepage.selectUserScreen();
		homepage.validateHomePage();
		usermanagementpage =homepage.addUser();
		homepage.validateUser();

	}
		
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}

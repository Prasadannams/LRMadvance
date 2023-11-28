package com.dru.qa.registration.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dru.qa.registration.base.Testbase;
import com.dru.qa.registration.pages.HomePage;
import com.dru.qa.registration.pages.LoginPage;
import com.dru.qa.registration.pages.UserManagmentPage;
import com.dru.qa.registration.util.Testutil;

public class UserManagementTest extends Testbase {

	LoginPage loginpage;
	HomePage homepage;
	UserManagmentPage usermanagementpage;
	Testutil testutil;
	String sheet = "usermanagement";

	public UserManagementTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initiliaze();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.selectUserScreen();
		usermanagementpage = homepage.addUser();
		usermanagementpage = new UserManagmentPage();
		testutil = new Testutil();
	}

	@DataProvider
	public Object[][] getLRMTestData() {
		Object data[][] = Testutil.getTestData(sheet);
		return data;
	}

	@Test(priority = 1, dataProvider = "getLRMTestData", description = "Add new user")
	public void validateUsers(String title, String fn, String ln, String gender, String em, String num,
			String doctortype) {
		usermanagementpage.selectHonorific(title);
		usermanagementpage.enterFirsName(fn);
		usermanagementpage.enterLastName(ln);
		usermanagementpage.selectGender(gender);
		usermanagementpage.enterEmail(em);
		usermanagementpage.enterMobile(num);
		usermanagementpage.selectLanguages();
		usermanagementpage.selectDesignations();
//		usermanagementpage.selectDoctorType(doctortype);
		usermanagementpage.selectSpecilaizations();

	}
	
	
	
	
    @AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(30);
		driver.quit();
	}

}

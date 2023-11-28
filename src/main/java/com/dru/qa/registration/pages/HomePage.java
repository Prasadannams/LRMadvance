package com.dru.qa.registration.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dru.qa.registration.base.Testbase;
import com.dru.qa.registration.util.Testutil;

public class HomePage extends Testbase {
	
	

	// PageFactory

	@FindBy(xpath = ("//button[@class='btn-menu']"))
	WebElement menuButton;

	@FindBy(xpath = ("//div[@class='col-sm-12 menu-child-items m-t-12']/ul/li/p[text()='Admin']"))
	WebElement selectModule;

	@FindBy(xpath = ("//div[text()='User Management']"))
	WebElement selectScreen;

	@FindBy(xpath = ("//h2[text()='User Management']"))
	WebElement homePage;

	@FindBy(xpath = ("//button[text()=' Add New User ']"))
	WebElement addNewUser;

	@FindBy(xpath = ("//h2[text()=' Personal Details ']"))
	WebElement userDetails;

	@FindBy(xpath = ("//iframe[@class='iframe-width ng-star-inserted']"))
	WebElement frmaeUser;

	// Initialize page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions Methods

	public void selectUserScreen() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Testutil.implict_wait));
		menuButton.click();
		selectModule.click();
		selectScreen.click();       

	}

	public void validateHomePage() {

		driver.switchTo().frame(frmaeUser);
		homePage.isDisplayed();
		driver.switchTo().defaultContent();

	}

	public UserManagmentPage addUser() {
		driver.switchTo().frame(frmaeUser);
		addNewUser.click();
		return new UserManagmentPage();
	}

	public boolean validateUser() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(userDetails));
		return userDetails.isDisplayed();

	}

}

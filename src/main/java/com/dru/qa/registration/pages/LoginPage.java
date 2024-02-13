package com.dru.qa.registration.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.dru.qa.registration.helpers.Helpers;

public class LoginPage extends Helpers{
	
	WebDriver _driver;
	Logger logger= Logger.getLogger(LoginPage.class);
	
	public Helpers helpers;
	
	//create a PageFactory	
	@FindBy(xpath=("//img[@class='logo-size']"))
	WebElement druLogo;
	
	@FindBy(xpath=("//input[@formcontrolname='UserName']"))
	WebElement userName;
	
	@FindBy(xpath=("//*[@class='form-control ng-untouched ng-pristine ng-valid']"))
	WebElement passWord;
	
	@FindBy(xpath=("//*[text()=' Login ']"))
	WebElement loginButton;
	
	@FindBy(xpath=("//h4[text()='Log out of other device?']"))
	WebElement otherDevice;
	
	@FindBy(xpath=("//button[@class='btn-sm btn-primary']"))
	WebElement accept;
	
	//Initialize page objects
	public LoginPage() {
		this._driver = driver;
		PageFactory.initElements(driver, this);
		 helpers = new Helpers();
	}
	
	//Create a Action Methods
	
	public String validateURL() {
		return driver.getTitle();
	}
	
	public boolean validateLoginPage() {
		
		return isDisplay(druLogo);
	
	}
	
	public HomePage login(String username , String pwd) {
        helpers.implicitWait(3);
        logger.info("Waiting for fw seconds");
        helpers.sendKeys(userName, username);
        helpers.sendKeys(passWord, pwd);
        helpers.performClick(loginButton);
		try {
			if(otherDevice.isDisplayed()) {
				accept.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new HomePage();
		
		
	}

}

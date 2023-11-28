package com.dru.qa.registration.pages;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dru.qa.registration.helpers.Helpers;

public class UserManagmentPage extends Helpers {
	
	Helpers helpers;
	
	@FindBy(xpath=("//iframe[@class='iframe-width ng-star-inserted']"))
	WebElement frmaeUser;
	
	@FindBy(xpath=("//select[@formcontrolname='honorificNm']"))
	WebElement honorific;
	
	@FindBy(xpath=("//input[@formcontrolname='firstNm']"))
	WebElement userName;
	
	@FindBy(xpath=("//input[@formcontrolname='lastNm']"))
	WebElement lastName;

	@FindBy(xpath=("//input[@formcontrolname='emailId']"))
	WebElement email;
	
	@FindBy(xpath=("//input[@formcontrolname='mobileNo']"))
	WebElement mobile;
	
	@FindBy(xpath=("//ng-select[@bindlabel='languageNm']"))
	WebElement selectlanguages;
	
	@FindBy(xpath=("//div[@class='ng-option ng-star-inserted']"))
	List<WebElement> languages;
	
	@FindBy(xpath=("//ng-select[@bindlabel='designation']"))
	WebElement selectdesignation;
	
	@FindBy(xpath=("//span[@class='ng-option-label ng-star-inserted']"))
	List<WebElement> designations;
	
	@FindBy(xpath=("//ng-select[@bindlabel='deptNm']"))
	WebElement selectDepartment;
	
	@FindBy(xpath=("//div[@class='ng-option ng-star-inserted']"))
	List<WebElement> departments;

	
	@FindBy(xpath=("//ng-select[@bindlabel='specialityNm']"))
	WebElement selectSpecialization;
	
	@FindBy(xpath=("//div[@class='ng-option ng-star-inserted']"))
	List<WebElement> specializations;
	
	
	
	
	//Initialize PageFatory
	public UserManagmentPage() {
		
		PageFactory.initElements(driver, this);
		helpers = new Helpers();
	}
	
	
	// Action Methods
	
	public void selectHonorific(String title) {
		Select select= new Select(honorific);
		select.selectByVisibleText(title);
	}
	
	public void enterFirsName(String fn) {
		helpers.sendKeysToWebElement(userName, fn);
	}	
	
	public void enterLastName(String ln) {
		helpers.sendKeysToWebElement(lastName, ln);
	}
		
	public void selectGender(String gender) {
	driver.findElement(By.xpath("//li[@class='radio m-r-48']/input[@value='"+gender+"']"));
	}
	
	public void enterEmail(String em) {
	helpers.sendKeysToWebElement(email, em);
	}
	
	public void enterMobile(String num) {
	 helpers.sendKeysToWebElement(mobile, num);		
	}
	
	public void selectLanguages() {
		helpers.performClick(selectlanguages);
			try {
				ListOfWebElements(languages);
			} catch (Exception e) { 		
		    	}
	}
	
	public void selectDesignations() {
		
			helpers.performClick(selectdesignation);
			for (int i = 0; i < designations.size(); i++) {
				designations.get(i).getText();
				helpers.scrollIntoView(designations.get(i));
				helpers.jsClick(designations.get(i));
				helpers.implicitWait(10);
				helpers.performClick(selectdesignation);

			}


	}
		
	public void selectDoctorType(String doctype) {

		driver.findElement(By.xpath("//label[@for='" + doctype + "']")).click();
		

	}
	
	
	public void selectSpecilaizations() {
			helpers.jsClick(selectDepartment);
	for(int i=0 ; i<departments.size(); i++) {
		departments.get(i).getText();
		helpers.scrollIntoView(departments.get(i));
		helpers.jsClick(departments.get(i));
		helpers.performClick(selectDepartment);
		
	}
	
}
	
	
}


	


	
	
	
	


package com.dru.qa.registration.helpers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dru.qa.registration.base.Testbase;

public class Helpers extends Testbase{
	
	
	
	
//===========ResUsable Methods==============
	
	public  void clickMethod(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(ele)).isEnabled();
		ele.click();
	}
	
	public  boolean isDisplay(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.visibilityOf(ele)).isDisplayed();
	}
	
	public  void clcik(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(ele)).click();
	}
	
	
	public  void display(WebElement ele , int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.isDisplayed();
	}
	
	// Used to Send Elements on WebPage
	public void sendKeysToWebElement(WebElement ele , String value) {
		ele.clear();
		ele.sendKeys(value);
	}
	
	public void performClick(WebElement ele) {
		ele.click();
	}
	
	
	public void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].click();", ele);
	}
	
	public void scrollIntoView(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
		
	
	
	//IT WILL ENTER VALUES AFTER CLEARING THE FIELD
	public void sendKeys(WebElement ele,  String un, WebElement ele1, String pwd ) {
		 ele.clear();
		 ele.sendKeys(un);
		 ele1.clear();
		 ele1.sendKeys(pwd);
	}
	
	public static void explicitWait(int time, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
	public void Designation() {
		
		List<WebElement> languages=driver.findElements(By.xpath(" //div[@class='ng-dropdown-panel-items scroll-host']/div/div"));
        for(WebElement lang : languages) {
        	if(lang.getText().equalsIgnoreCase("Telugu")) {
        		lang.click();
        	}
        }
	}
	
	public void ListOfWebElements(List<WebElement> elements) {
		for(WebElement ele : elements) {
             scrollIntoView(ele);
             jsClick(ele);
	
		
		}
		
	}
	
	public void implicitWait(int time) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
}
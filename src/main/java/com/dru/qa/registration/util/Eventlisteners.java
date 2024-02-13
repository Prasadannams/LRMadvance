package com.dru.qa.registration.util;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestListener;

import com.dru.qa.registration.base.Testbase;

public class Eventlisteners extends Testbase implements WebDriverListener, ITestListener {

	  public  void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
		  
		  try {
			Testutil.captueScreenShot(method.getName());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	  }



	@Override
	public void beforeGet(WebDriver driver, String url) {
		System.out.println("Before Navigating To URL " + url + "'");
	}

	@Override
	public void beforeIsDisplayed(WebElement element) {
		System.out.println("beforeIsDisplayed" + element + "'");
	}

	@Override
	public void beforeClick(WebElement element) {
	}

	@Override
	public void beforeFindElement(WebElement element, By locator) {

	}

}

package com.dru.qa.registration.testcases;

import org.testng.annotations.Test;

public class hyrpractise {
	
	
	@Test(priority=1,groups= {"smoke"})
	public void login() {
		System.out.println("Login Page");
	}




@Test(priority=2,groups= {"smoke","sanity"})
public void HomePage() {
	System.out.println("HomePage Page");
}



@Test(priority=3, groups={"regression"})
public void ProfilePage() {
	System.out.println("ProfilePage Page");
}

}
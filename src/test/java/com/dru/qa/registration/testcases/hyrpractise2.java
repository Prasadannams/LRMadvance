package com.dru.qa.registration.testcases;

import org.testng.annotations.Test;

public class hyrpractise2 {

	@Test(priority = 1, groups = { "smoke" })
	public void shipmenetcreate() {
		System.out.println(19/0);
		System.out.println("shipmenetcreate");
	}

	@Test(priority = 0, groups = { "smoke", "sanity" }, dependsOnMethods= {"shipmenetcreate"})
	public void trackshipment() {
		System.out.println("trackshipment");
	}

	@Test(priority = 3, groups = { "regression" }, dependsOnMethods= {"trackshipment"})
	public void cancelshipment() {
		System.out.println("cancelshipment");
	}
	
	@Test
	public void just() {
		System.out.println("always execute");
	}

}
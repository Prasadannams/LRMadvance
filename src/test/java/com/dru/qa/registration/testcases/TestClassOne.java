package com.dru.qa.registration.testcases;

import org.testng.annotations.Test;

public class TestClassOne {
	
	@Test
	public void testMethodOne() {
		
		System.out.println("TesstClassOne >> testMethodOne >> " + Thread.currentThread().getId() );
	}

	@Test
	public void testMethodTwo() {
		
		System.out.println("TesstClassOne >> testMethodTwo >> " + Thread.currentThread().getId() );
	}

	@Test
	public void testMethodThree() {
		
		System.out.println("TesstClassOne >> testMethodThree >> " + Thread.currentThread().getId() );
	}

	
	@Test
	public void testMethodFour() {
		
		System.out.println("TesstClassOne >> testMethodFour >> " + Thread.currentThread().getId() );
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

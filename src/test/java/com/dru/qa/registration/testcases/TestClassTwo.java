package com.dru.qa.registration.testcases;

import org.testng.annotations.Test;

public class TestClassTwo {
	
	@Test
	public void testMethodFive() {
		
		System.out.println("TesstClassTwo >> testMethodFive >> " + Thread.currentThread().getId() );
	}

	@Test
	public void testMethodSix() {
		
		System.out.println("TesstClassTwo >> testMethodSix >> " + Thread.currentThread().getId() );
	}

	@Test
	public void testMethodSeven() {
		
		System.out.println("TesstClassTwo >> testMethodSeven >> " + Thread.currentThread().getId() );
	}

	
	@Test
	public void testMethodEight() {
		
		System.out.println("TesstClassTwo >> testMethodEight >> " + Thread.currentThread().getId() );
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

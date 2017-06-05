package com.javafortesters.chap006domainentities.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise12 {


	@Test
	public void canConstructWithYearsAndExperience(){
	User1 user1 = new User1("27","10 months");	
	assertEquals("given years old","27",User1.getYears());
	assertEquals("given experience time","10 months",User1.getExperience());
	} 
}     
 

package com.javafortesters.chapjunit.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFirstTest {

	@Test
	public void canAddTwoPlusTwo(){
	int answer=2+2;
	assertEquals("2+2=4",4,answer);
		
		
	
		
	}
}

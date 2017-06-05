package com.javafortesters.chapjunit.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise1 {

	@Test
	public void checkTwoMinusTwo(){
		int answer = 2-2;
		assertEquals("2-2=0",0,answer);
	}
	 
}

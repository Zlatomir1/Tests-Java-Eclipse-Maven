package com.javafortesters.chapjunit.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise2 {
	
	@Test
	public void checkFourDivisionOfTwo(){
	int answer = 4/2;
	assertEquals("4/2=2",2,answer);
	}
}

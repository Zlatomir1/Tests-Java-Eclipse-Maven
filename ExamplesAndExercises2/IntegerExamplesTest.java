package com.javafortesters.chapnextjunit.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerExamplesTest {

	@Test
	public void integerExploration(){
		Integer four = new Integer(4);	
		assertEquals("intValue returns int 4",4,four.intValue());
		Integer five = new Integer(5);
		assertEquals("intValue returns int 5",5,five.intValue());
	}

}

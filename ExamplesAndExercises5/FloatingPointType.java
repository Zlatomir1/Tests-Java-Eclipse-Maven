package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class FloatingPointType {

	@Test
	public void FloatingPointType(){
	float singlePrecision32bit;
	double doublePrecision64bit;
	
	System.out.println("* `float` range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
			System.out.println( "* `double` range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
			
			singlePrecision32bit = 10.0F; 
			assertEquals(10F, singlePrecision32bit, 0);
			doublePrecision64bit = 20.0; 
			assertEquals(20D, doublePrecision64bit, 0);
	}
}

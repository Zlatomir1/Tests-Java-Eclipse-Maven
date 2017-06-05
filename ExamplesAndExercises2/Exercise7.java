package com.javafortesters.chapnextjunit.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise7 {

	@Test
	public void  checkIntegerValue(){
	  Integer MIN_VALUE = new Integer(-2147483648);
	  Integer MAX_VALUE = new Integer(2147483647);
	  assertEquals("MIN_VALUE must be -2147483648",-2147483648,MIN_VALUE.intValue());
	  assertEquals("MAX_VALUE must be 2147483647",2147483647,MAX_VALUE.intValue());
}	
	}

package com.javafortesters.chapnextjunit.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerExapleTwo {

	@Test
	public void integerExploration(){
	Integer six = new Integer(6);
	assertEquals("autoboxing assigment for 6",6,six.intValue());
}
}

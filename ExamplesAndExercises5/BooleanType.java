package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class BooleanType {

	@Test
	public void setUp(){
	boolean truthy=true;
	boolean falsey=false;
	
	assertTrue(truthy);
	assertFalse(falsey);
	truthy=Boolean.TRUE;
	falsey=Boolean.FALSE;
	assertTrue(truthy);
	assertFalse(falsey);
}
}
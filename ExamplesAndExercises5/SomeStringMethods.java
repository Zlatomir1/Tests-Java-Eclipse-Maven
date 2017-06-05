package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeStringMethods {

	@Test
	public void someStringMethods(){
		
	String aString = "abcdef";
	assertEquals(6, aString.length());
	assertTrue(aString.compareToIgnoreCase("ABCDEF")==0);
	assertTrue(aString.contains("bcde"));
	assertTrue(aString.startsWith("abc"));
	// String indexing starts at 0.
	assertEquals('c', aString.charAt(2));
	assertEquals("ef", aString.substring(4));
	}
}

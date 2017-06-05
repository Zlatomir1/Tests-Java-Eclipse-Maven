package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class BooleanOperatorsExplored {

	@Test
	public void booleanOperatorsExplored(){
	assertTrue( 4 == 4 );
	assertTrue(4 != 5);
	assertTrue(3 < 4);
	assertTrue(5 > 4);
	assertTrue( 6 >= 6);
	assertTrue( 7 >= 6);
	assertTrue( 8 <= 8);
	assertTrue( 8 <= 9);
	assertTrue(!false);
	boolean truthy = true;
	assertFalse(!truthy);
	}
	
}

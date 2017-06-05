package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class TernaryOperatorsExplored {

	@Test
	public void ternaryOperatorsExplored(){
	int x;
	x = 4>3 ? 2 : 1;
	assertEquals(2, x);
	
	//Another type of verification
	assertTrue(5>=4 ? true : false);
	}
}

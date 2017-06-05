package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalOperatorsExplored {
	
	@Test
	public void conditionalOperatorsExplored(){
	assertTrue(true && true);
	assertTrue(true || false);
	assertTrue(false || true);
	assertFalse(false || false);
	assertFalse(false && true);
	}
}

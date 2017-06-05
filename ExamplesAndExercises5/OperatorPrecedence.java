package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperatorPrecedence {

	@Test
	public void operatorPrecedence(){
	assertEquals(8, 4+2*6/3 );
	assertEquals(12, (((4+2)*6)/3) );
	}
}

package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitwiseShiftOperatorsExplored {

	@Test
	public void bitwiseShiftOperatorsExplored(){
	int x = 56;
	assertEquals(x*2, x<<1);
	assertEquals(x*4, x<<2);
	assertEquals(x*8, x<<3);
	x <<=3;
	assertEquals(56*8, x);
	x = Integer.MAX_VALUE;
	assertEquals(Integer.MAX_VALUE/2, x>>1);
	assertEquals(Integer.MAX_VALUE/4, x>>2);
	assertEquals(Integer.MAX_VALUE/8, x>>3);
	x = Integer.MIN_VALUE; 
	assertEquals((Integer.MAX_VALUE/2)+1, x>>>1);
	}
}

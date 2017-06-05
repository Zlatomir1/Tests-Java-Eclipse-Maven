package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitwiseOperatorsExplored {

	@Test
	public void bitwiseOperatorsExplored(){
		
	assertEquals(0b0001,0b1001 & 0b0101);	
	assertEquals(0b1101,0b1001 | 0b0101);
	assertEquals(0b1100,0b1001 ^ 0b0101);
	int x = 0b0001;
	assertEquals("11111111111111111111111111111110",
	Integer.toBinaryString(~x));
	
	byte y = 0b0001;
	y &= 0b1011;
	assertEquals(0b0001, y);
	y |= 0b1001;
	assertEquals(0b1001, y);
	y ^= 0b1110;
	assertEquals(0b0111, y);
	}
			
	}

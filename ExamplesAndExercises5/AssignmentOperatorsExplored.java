package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssignmentOperatorsExplored {

		@Test
		public void assignmentOperatorsExplored(){
		String ab ="ab";
		assertEquals("ab",ab);
		
		int num =10;
		assertEquals(10,num);
		
		num +=2;
		assertEquals("+= increments by",12,num);
		
		num -=4;
		assertEquals("-+ decrements by",8,num);
		
		num *= 2;
		assertEquals("*= multiplies by", 16, num);
		
		num /= 4;
		assertEquals("*= multiplies by", 4, num);
		
		num %=3;
		assertEquals("%= modulus of", 1, num);
		
		
		}
}

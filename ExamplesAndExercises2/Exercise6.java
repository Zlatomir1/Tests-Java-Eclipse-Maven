package com.javafortesters.chapnextjunit.examples;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Exercise6 {

		@Test
		public void integerToHex(){
			Integer b = new Integer(11);
			Integer a = new Integer(10);
			Integer three = new Integer(3);
			Integer twentyOne = new Integer(15);
			
			Integer.toHexString(b);
			Integer.toHexString(a);
			Integer.toHexString(three);
			Integer.toHexString(twentyOne);
			
			assertEquals("b must be 11",11,b.intValue());
			assertEquals("a must be 10",10,a.intValue());
			assertEquals("three must be 3",3,three.intValue());
			assertEquals("21 must be 15",15,twentyOne.intValue());
			
			Integer f = new Integer (11);
			Integer.valueOf(f);
			assertEquals("value of f must be 11",11,f.intValue());
			
			Integer g = new Integer (10);
			Integer.valueOf(g);
			assertEquals("value of g must be 10",10,g.intValue());
			
			Integer h = new Integer (3);
			Integer.valueOf(h);
			assertEquals("value of h must be 3",3,h.intValue());
			
			Integer j = new Integer (15);
			Integer.valueOf(j);
			assertEquals("value of j must be 15",15,j.intValue());
			
		}
}

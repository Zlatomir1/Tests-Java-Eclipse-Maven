package com.javafortesters.chapnextjunit.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exersice5 {

	
		@Test
		public void integerExploration(){
			Integer a = new Integer (10);
			assertEquals("a returns value of 10",10,a.intValue());
			
		}
}

package com.javafortesters.chapjunit.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise3 {

		@Test
		public void checkTwoMultipleOfTwo(){
		int answer = 2*2;
		assertEquals ("2*2 = 4",4,answer);
		
		}
		
}

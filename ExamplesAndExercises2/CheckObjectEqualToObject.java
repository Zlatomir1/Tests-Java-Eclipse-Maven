package com.javafortesters.chapnextjunit.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckObjectEqualToObject {

	@Test
	public void checkObjects(){
		assertEquals(4,4);
		assertTrue(4==4);
		//If we uncomment this on next row, our test will be failed. -> 
		//assertFalse(4==4);
		Integer firstFour = new Integer(4);
		Integer secondFour = new Integer(4);
		assertEquals(firstFour, secondFour);
		/*assertTrue(firstFour == secondFour); //<- Here also fails.
		Because Integer firstFour and secondFour both refer to different objects.
		Even they have the same value they are different objects.
		== Operator check that if firstFour and secondFour refer in the same
		instantiation.
		*/
		assertTrue(firstFour.equals(secondFour));
		
	}
}

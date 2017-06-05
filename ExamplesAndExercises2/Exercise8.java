package com.javafortesters.chapnextjunit.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise8 {
	@Test
	public void checkTheOdd(){
		Integer value1 = new Integer(5); 
		Integer value2 = new Integer(10);
		Integer answer = new Integer(2);
		if(value2 % value1 == 1) {
			   assertEquals("10 /5 ==!1",1,answer.intValue());
		}else{
			assertEquals("10 /5 ==0",2,answer.intValue());
		
		}
	}
}
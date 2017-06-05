package com.javafortesters.chapnextjunit.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise9 {
	@Test
	public void testExapleOdd(){
	
	
	Integer value1 = new Integer(1);

	for(value1=1;value1<12;value1++);
	assertEquals("Value 1 =12",12,value1.intValue());
	value1--;
    assertEquals("Value 1 =11",11,value1.intValue());
    
    for(value1=1;value1<1;value1--);
    assertEquals("Value 1 =1",1,value1.intValue());
	}

	}


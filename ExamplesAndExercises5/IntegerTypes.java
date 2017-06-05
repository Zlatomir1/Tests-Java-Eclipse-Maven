package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerTypes {

	@Test
	public void IntegerTypes(){
	byte aByteHas1Byte;
	short aShtortHas2Bytes;
	int anIntHas4Bytes;
	long aLongHas8Bytes;
	
	System.out.println("*'byte' range: "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
	System.out.println("*'Short' range: "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
	System.out.println("*'Integer' range: "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
	System.out.println("*'Long' range: "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
	
	aLongHas8Bytes = 0L; 
	assertEquals(0, aLongHas8Bytes);
	aByteHas1Byte=0xA;
	assertEquals(10,aByteHas1Byte);
	anIntHas4Bytes=010;
	assertEquals(8,anIntHas4Bytes);
	aByteHas1Byte=0b0010;
	assertEquals(aByteHas1Byte, 2);
	aLongHas8Bytes = 9_000_000_000L;
	assertEquals(9000000000L, aLongHas8Bytes);
	}
}

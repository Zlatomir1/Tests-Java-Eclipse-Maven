package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.apache.bcel.generic.INSTANCEOF;
import org.junit.Test;

public class VariableNaming {
	public static final String CONSTANTA = "a constant CONSTANT string";
	public static String aClassField = "a class field";
	public String pubField = "a public field";
	
	@Test
	public void variableNaming(){
	String $aString="bob";
	float £owed=10f;
	int aMount = 4;
	long  Amount =5;
	String A0123456789bCd$f="ugh";
	final String CONSTANT = "a constant string";
	assertEquals(4,aMount);
	assertEquals(5,Amount);
	assertEquals(10.0F, £owed, 0);
	assertEquals("bob", $aString);
	assertEquals("ugh", A0123456789bCd$f);
	assertEquals(CONSTANT,"a constant string");
	assertEquals(CONSTANTA,"a constant CONSTANT string");
	assertEquals(aClassField,"a class field");
	assertEquals(pubField,"a public field");
	}
}

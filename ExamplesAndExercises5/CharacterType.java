package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterType {

	@Test
	public void characterType(){
	char aChar = '\u0026';	
	assertEquals(aChar,'\u0026');
	assertEquals(aChar,'&');
	
	}
}

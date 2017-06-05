package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class AJavaDocComment {

	@Test
	public void aJavaDocComment(){
	assertTrue(addTwoNumbers(4,3)==7);
		}

	/**
	* Add two integers and return an int.
	*
	* There is a risk of overflow since two big
	* integers would max out the return int.
	*
	* @param a is the first number to add
	* @param b is the second number to add
	* @return a+b as an int
	*/ 
		
		public int addTwoNumbers(int a,int b){
			return a+b;
		}
}

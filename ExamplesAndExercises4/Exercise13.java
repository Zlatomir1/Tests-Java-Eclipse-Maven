package com.javafortesters.chap006domainentities.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise13 {
	
	@Test
	public void uExercise2(){
	User2 user2 = new User2("admin", "pA55w0rD");
	assertEquals("given username expected","admin",user2.getUsername());
	assertEquals("given password expected","pA55w0rD",user2.getPassword());
						 
	}
}
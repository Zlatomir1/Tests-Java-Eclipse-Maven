package com.javafortesters.chap006domainentities.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class CanConstructWithUsernameAndPassword {

	@Test
	public void canConstructWithUsernameAndPassword(){
		User user = new User("admin","pA55w0rD");
		assertEquals("given username expected","admin",user.getUsername());
		assertEquals("given password expected","pA55w0rD",user.getPassword());
	}
}

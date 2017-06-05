package com.javafortesters.chap006domainentities.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise11 {
	
	private Object username;
	private Object password;

	@Test
	public void userHasDefaultUsernameAndPassword(){
	User User = new User();
	assertEquals("default username expected","bob",User.getName());
	assertEquals("default password expected","123",User.getPass());
	

	}
}
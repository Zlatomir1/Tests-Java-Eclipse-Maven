package com.javafortesters.chap006domainentities.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserHasDefaultUsernameAndPassword {

	
		private Object username;
		private Object password;

		@Test
		public void userHasDefaultUsernameAndPassword(){
		User User = new User();
		assertEquals("default username expected",username,User.getUsername());
		assertEquals("default password expected",password,User.getPassword());
		
	}

}

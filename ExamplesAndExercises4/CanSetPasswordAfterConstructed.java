package com.javafortesters.chap006domainentities.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class CanSetPasswordAfterConstructed {
	
	@Test
	public void canSetPasswordAfterConstructed(){
	User user =new User();
	user.setPassword("PaZZwor6");
	assertEquals("setter password expeted","PaZZwor6",user.getPassword());
	}
}

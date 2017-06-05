package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAppEnvironmentTest1 {

	@Test
	 public void canGetUrlStatically(){
	 assertEquals("Returns Hard Coded URL","http://192.123.0.3:67",TestAppEnv.getUrl());
	 }
	
	 @Test
	 public void canGetDomainAndPortStatically(){
	
	 assertEquals("Just the Domain","http://192.123.0.3:67",TestAppEnv.DOMAIN);
	
	assertEquals("Just the port","67",TestAppEnv.PORT);
}
}
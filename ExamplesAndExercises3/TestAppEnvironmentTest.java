package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAppEnvironmentTest {
	@Test
	public void canGetUrlStatically(){
		
		assertEquals("Returns Hard Coded URL","http://192.123.0.3:67",TestAppEnv.getUrl());
	}
}

package com.javafortesters.chap005testwithourownclasses.domainobject.examples;
import static org.junit.Assert.*;
import org.junit.Test;
public class CanGetDomainAndPortStatically {
	
	@Test
	public void canGetDomainAndPortStatically(){
		assertEquals("Just the Domain","192.123.0.3:67",TestAppEnv.DOMAIN);
		assertEquals("Just the port","67",TestAppEnv.PORT);
		
	
		
	}

}
		
	

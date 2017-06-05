package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Exercise10 {
	public static final String PORT = "67";
	public static final String DOMAIN = "http://192.123.0.3:67";
	
		@Test
		public void setUp(){
		Assert("Returns Hard Coded URL","http://192.123.0.3:67",TestAppEnv.getUrl());
		Assert("Just the port","67",TestAppEnv.PORT);
		Assert("All values","http://192.123.0.3:67+PORT+:+DOMAIN",TestAppEnv.getAll());
		Assert("Just for DOMAIN","http://192.123.0.3:67",TestAppEnv.DOMAIN);
		Assert("Just for PORT","67",TestAppEnv.PORT);
		}
		//Instead of assertEquls we can also use Assert.
		//So we must create method.
		private void Assert(String string, String string2, String url) {
			
		}
}

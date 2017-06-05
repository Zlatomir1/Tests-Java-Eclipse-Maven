package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

public class TestAppEnv {
	
	public static final String DOMAIN = "http://192.123.0.3:67";
	public static final String PORT = "67";

	//DOMAIN and PORT are for other class (CanGetDomainAndPortStatically) static methods 
	//for initiate DOMAIN and PORT

	public static String getUrl() {
		
		return "http://192.123.0.3:67";
		/*
		Change String with int from the exercises. Error of course.The int 
		wait for int return as String wait for string return.
		Also if we change the string with null value or with "null"
		the test will fail because return value must be Equal to the expected result. In our
		case expected result is "http://192.123.0.3:67" in other class 
		"class TestAppEnvironmentTest"
		*/
	}
		public static String getAll() {
			
			return "http://192.123.0.3:67"+PORT+":"+DOMAIN;
		
	}
}



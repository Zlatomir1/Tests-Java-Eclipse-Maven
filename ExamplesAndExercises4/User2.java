package com.javafortesters.chap006domainentities.examples;

public class User2 {
	
	private String username;
	private String password;

	public User2(String username, String password) {
		/*According to exercises, removing the "this." will destroy 
		 * reference and the test will be failed. */
//	username = username;
//	password = password;
	this.username = username;
	this.password = password;
		}

	public Object getPassword() {
		return password;
	}

	public Object getUsername() {
		return username;
	}
}

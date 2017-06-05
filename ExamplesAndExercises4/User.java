package com.javafortesters.chap006domainentities.examples;

public class User {
//For class "canConstructWithUsernameAndPassword" 
	static String username;
	static String password;
	
	
	public User(){
}
	
	public User(String username, String password) {
		this.username=username;
		this.password=password;
		
		
	}
	//For class "UserHasDefaultUsernameAndPassword"
	public static String getPassword() {
		return password;
	}
	public static String getUsername() {
		return username;
	
	
}
	//For class "Exercise11"
	public Object getName() {	
		return "bob";
	}
	public Object getPass() {
		return "123";

	
	
	}
//For "CanSetPasswordAfterConstructed" class. 
	public void setPassword(String password) {
		this.password=password;
		
	}

}

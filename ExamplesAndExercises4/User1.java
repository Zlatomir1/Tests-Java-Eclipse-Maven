package com.javafortesters.chap006domainentities.examples;
//For class "Exercise12".
public class User1 {

	static String years;
	static String experience;
	
	
	public User1(){

	}
	public User1(String years, String experience) {
		this.years=years;
		this.experience=experience;
			}
	public static Object getYears() {
		
		return years;
	}
	public static Object getExperience() {
		
		return experience;
	}
	}




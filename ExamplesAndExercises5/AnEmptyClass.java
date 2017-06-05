package com.javafortesters.chap007basicsofjavarevisited.examples;

public class AnEmptyClass {
	
	public static final String CONSTANT="a constant string";
	public static String aClassField = "a class field";
	protected static String proField="a class field";
	private String name;
	
	public AnEmptyClass(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	
}

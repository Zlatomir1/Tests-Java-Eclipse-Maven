package com.javafortesters.chapjunit.examples;

import org.junit.Test;

public class ASysOutJunitTest {

	
	@Test
	public void canOutputHelloWorldToConsole(){
	AClassWithAMethod myClass = new AClassWithAMethod();
	myClass.aMethodOnAClass();
}
}
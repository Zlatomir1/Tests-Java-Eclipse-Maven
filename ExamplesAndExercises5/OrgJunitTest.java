package com.javafortesters.chap007basicsofjavarevisited.examples;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
public class OrgJunitTest {

	@org.junit.Test
	public void nonImportTest(){
	org.junit.Assert.assertEquals(3, 2 + 1);
	assertEquals(6,3+3);
	Assert.assertEquals(5,3+2);
	}	
}
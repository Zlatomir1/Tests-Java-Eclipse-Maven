package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;



public class traditionalOperatorsExplored {

	@Test
	public void traditionalOperatorsExplored(){
		assertEquals(4, 2+2);
		assertEquals(5L, 10L - 5L);
		assertEquals(25.0F, 12.5F * 2F,0);
		assertEquals(30.2D, 120.8D / 4D, 0);
		assertEquals("abcd", "ab" + "cd");
		assertEquals(1, 9%2);
		
		Assert.assertEquals(0.0012f, 0.0014f, 0.0002); // true test passed, if 0.0002  be changed to
		// 0.0001 false. Etc. test failed
		
		}	
	
	}
	


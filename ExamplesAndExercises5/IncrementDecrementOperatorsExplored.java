package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class IncrementDecrementOperatorsExplored {

		@Test
		public void incrementDecrementOperatorsExplored(){
			int num=10;
			assertEquals(11,++num);
			assertEquals(10,--num);
			assertEquals(10, num++);
			assertEquals(11, num);
			assertEquals(11, num--);
			assertEquals(10, num);
			}
		}


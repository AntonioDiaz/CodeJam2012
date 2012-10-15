package com.test;

import com.Recicled;

import junit.framework.TestCase;

/**
 * @author antonio.diaz.arroyo@gmail.com
 * Test for Qualification Round of Code Jam 2012: Exercise C  
 */
public class TestRecicled extends TestCase {

	public void testCalculateRecicledPairs01(){
		String inStr = "1 9";
		int result = 0;
		assertEquals(result, Recicled.calculateRecicledPairs(inStr));
	}
	
	public void testCalculateRecicledPairs02(){
		String inStr = "10 40";
		int result = 3;
		assertEquals(result, Recicled.calculateRecicledPairs(inStr));
	}
	
	public void testCalculateRecicledPairs03(){
		String inStr = "100 500";
		int result = 0;
		assertEquals(result, Recicled.calculateRecicledPairs(inStr));
	}
	
	public void testCalculateRecicledPairs04(){
		String inStr = "1111 2222";
		int result = 0;
		assertEquals(result, Recicled.calculateRecicledPairs(inStr));
	}
}

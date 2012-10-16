package com.test;

import com.Mirror;

import junit.framework.TestCase;

/**
 * @author antonio.diaz.arroyo@gmail.com
 * Test for Qualification Round of Code Jam 2012: Exercise D  
 */
public class TestMirror extends TestCase{

	/**
	 * Test 01.
	 */
	public void testMirror01(){
		int expected = 0;
		String strInDates = "3 3 1";
		String strInGrid = 
				"###" +
				"#X#" +
				"###";
		assertEquals(expected, new Mirror(strInDates, strInGrid).calculateReflections());
	}
}

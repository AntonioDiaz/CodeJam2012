package com.test;

import com.Mirror;

import junit.framework.TestCase;

/**
 * @author antonio.diaz.arroyo@gmail.com
 * Test for Qualification Round of Code Jam 2012: Exercise D  
 */
public class TestMirror extends TestCase{

	public void testMirror01(){
		int expected = 4;
		String strIn = 
				"3 3 1" +
				"###" +
				"#X#" +
				"###";
		System.out.println(strIn);
		assertEquals(expected, Mirror.calculateReflections(strIn));
	}
	
	public void testMirror02(){
		int expected = 8;
		String strIn = 
				"3 3 2" +
				"###" +
				"#X#" +
				"###";
		System.out.println(strIn);
		assertEquals(expected, Mirror.calculateReflections(strIn));
	}
	
	public void testMirror03(){
		int expected = 68;
		String strIn = 
				"4 3 8" +
				"###" +
				"#X#" +
				"#.#" +
				"###";
		System.out.println(strIn);
		assertEquals(expected, Mirror.calculateReflections(strIn));
	}
	
	public void testMirror04(){
		int expected = 0;
		String strIn = 
				"7 7 4" +
				"#######" +
				"#.....#" +
				"#.....#" +
				"#..X..#" +
				"#....##" +
				"#.....#" +
				"#######";
		System.out.println(strIn);
		assertEquals(expected, Mirror.calculateReflections(strIn));
	}
	
	public void testMirror05(){
		int expected = 2;
		String strIn = 
				"5 6 3" +
				"######" +
				"#..X.#" +
				"#.#..#" +
				"#...##" +
				"######";
				System.out.println(strIn);
		assertEquals(expected, Mirror.calculateReflections(strIn));
	}
	
	public void testMirror06(){
		int expected = 28;
		String strIn = 
				"5 6 10" +
				"######" +
				"#..X.#" +
				"#.#..#" +
				"#...##" +
				"######";
		System.out.println(strIn);
		assertEquals(expected, Mirror.calculateReflections(strIn));
	}
	
}

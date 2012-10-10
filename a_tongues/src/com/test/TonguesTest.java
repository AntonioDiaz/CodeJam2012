package com.test;

import java.util.ArrayList;
import java.util.List;

import com.Tongues;

import junit.framework.TestCase;

/**
 * Test the com.Tongues class. 
 * @author A153655
 */
public class TonguesTest extends TestCase{

	/**
	 * 
	 */
	public void testLine1(){
		List<String> list = new ArrayList<String>();
		String lineIn1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String lineOut1 = "our language is impossible to understand";
		list.add(lineIn1);
		
		String lineIn2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String lineOut2 = "there are twenty six factorial possibilities";
		list.add(lineIn2);
		
		String lineIn3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String lineOut3 = "so it is okay if you want to just give up";
		list.add(lineIn3);
		
		List<String>listOut = Tongues.decodeList(list);
		assertEquals(lineOut1, listOut.get(0));
		assertEquals(lineOut2, listOut.get(1));
		assertEquals(lineOut3, listOut.get(2));
	}
}

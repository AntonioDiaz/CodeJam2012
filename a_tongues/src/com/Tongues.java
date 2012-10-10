package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
 * Solution of problem A. Speaking in Tongues
 * @author antonio.diaz.arroyo@gmail.com
 * @see <a href="http://code.google.com/codejam/contest/1460488/dashboard">Speaking in Tongues</a>
 */
public class Tongues {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InputStream inputStream = Tongues.class.getResourceAsStream("A-small-practice.in");
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		int numLines = Integer.parseInt(bufferReader.readLine());
		String line;
		List<String> myList = new ArrayList<String>();
		for (int i = 0; i < numLines; i++) {
			myList.add(bufferReader.readLine());
		}
		List<String> decodeList = Tongues.decodeList(myList);
		for (int i = 0; i < numLines; i++) {
			line = decodeList.get(i);
			line = String.format("Case #%1$d: %2$s ", i+1, line);
			System.out.println(line);			
			//System.out.println();			
		}
		bufferReader.close();
		inputStreamReader.close();
		inputStream.close();
	}
	
	/**
	 * 
	 * @param listIn
	 * @return
	 */
	public static List<String> decodeList(List<String> listIn) {
		Map <Byte, Byte> replaceMap = new HashMap<Byte, Byte>();  
		replaceMap.put(new Byte((byte)'y'), new Byte((byte)'a'));
		replaceMap.put(new Byte((byte)'n'), new Byte((byte)'b'));
		replaceMap.put(new Byte((byte)'f'), new Byte((byte)'c'));
		replaceMap.put(new Byte((byte)'i'), new Byte((byte)'d'));
		replaceMap.put(new Byte((byte)'c'), new Byte((byte)'e'));
		replaceMap.put(new Byte((byte)'w'), new Byte((byte)'f'));
		replaceMap.put(new Byte((byte)'l'), new Byte((byte)'g'));
		replaceMap.put(new Byte((byte)'b'), new Byte((byte)'h'));
		replaceMap.put(new Byte((byte)'k'), new Byte((byte)'i'));
		replaceMap.put(new Byte((byte)'u'), new Byte((byte)'j'));
		replaceMap.put(new Byte((byte)'o'), new Byte((byte)'k'));
		replaceMap.put(new Byte((byte)'m'), new Byte((byte)'l'));
		replaceMap.put(new Byte((byte)'x'), new Byte((byte)'m'));
		replaceMap.put(new Byte((byte)'s'), new Byte((byte)'n'));
		replaceMap.put(new Byte((byte)'e'), new Byte((byte)'o'));
		replaceMap.put(new Byte((byte)'v'), new Byte((byte)'p'));
		replaceMap.put(new Byte((byte)'z'), new Byte((byte)'q'));
		replaceMap.put(new Byte((byte)'p'), new Byte((byte)'r'));
		replaceMap.put(new Byte((byte)'d'), new Byte((byte)'s'));
		replaceMap.put(new Byte((byte)'r'), new Byte((byte)'t'));
		replaceMap.put(new Byte((byte)'j'), new Byte((byte)'u'));
		replaceMap.put(new Byte((byte)'g'), new Byte((byte)'v'));
		replaceMap.put(new Byte((byte)'t'), new Byte((byte)'w'));
		replaceMap.put(new Byte((byte)'h'), new Byte((byte)'x'));
		replaceMap.put(new Byte((byte)'a'), new Byte((byte)'y'));
		replaceMap.put(new Byte((byte)'q'), new Byte((byte)'z'));
		List<String> listOut = new ArrayList<String>();
		for (String stringIn : listIn) {
			String stringOut = "";
			byte[] bytes = stringIn.getBytes();
			for (int i = 0; i < bytes.length; i++) {
				if (replaceMap.get(bytes[i])!=null) {
					bytes[i] = replaceMap.get(bytes[i]);
				}
			}
			stringOut = new String (bytes);
			listOut.add(stringOut);
			System.out.println(stringIn);
			System.out.println(stringOut);
		}
		return listOut;
	}
}

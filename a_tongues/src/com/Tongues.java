package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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
	
	
	public static List<String> decodeList(List<String> listIn) {
		List<String> listOut = new ArrayList<String>();
		for (String string : listIn) {
			listOut.add(string);
		}
		return listOut;
	}

}

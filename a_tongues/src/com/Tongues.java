package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 
 * @author antonio.diaz.arroyo@gmail.com
 *
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
		String linea;
		while ((linea = bufferReader.readLine())!=null) {
			System.out.println(linea);
		}
		bufferReader.close();
		inputStreamReader.close();
		inputStream.close();
	}

}

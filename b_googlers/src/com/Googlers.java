package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Problem B. 
 * @see <a href="http://code.google.com/codejam/contest/1460488/dashboard#s=p1">Dancing With the Googlers</a> 
 * @author antonio.diaz.arroyo@gmail.com
 */

public class Googlers {

	/**
	 * 
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream inputStream = Googlers.class.getResourceAsStream("B-small-practice.in");
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader br = new BufferedReader(inputStreamReader);
		int numCases = Integer.parseInt(br.readLine()); 
		for (int i = 0; i < numCases; i++) {
			System.out.println(br.readLine());
		}
		
		br.close();
		inputStreamReader.close();
		inputStream.close();
	}
	
	/**
	 * 
	 * @author A153655
	 *
	 */
	public class Dancers {
		public Dancers (String input) {
			String[] split = input.split(" ");
			int triplets = Integer.parseInt(split[0]);
			surprising = new Integer(split[1]);
			average = new Integer(split[2]);
		}
		
		List<Integer> scores;
		Integer surprising;
		Integer average;
		
		
		public List<Integer> getScores() {
			return scores;
		}
		public void setScores(List<Integer> scores) {
			this.scores = scores;
		}
		public Integer getSurprising() {
			return surprising;
		}
		public void setSurprising(Integer surprising) {
			this.surprising = surprising;
		}
		public Integer getAverage() {
			return average;
		}
		public void setAverage(Integer average) {
			this.average = average;
		}
	}
	
}

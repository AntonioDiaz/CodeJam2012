package com;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Problem B. 
 * @see <a href="http://code.google.com/codejam/contest/1460488/dashboard#s=p1">Dancing With the Googlers</a> 
 * @author antonio.diaz.arroyo@gmail.com
 */

public class Googlers {

	List<Integer> scores;
	Integer surprising;
	Integer scoreReference;
	
	/**
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream inputStream = Googlers.class.getResourceAsStream("B-large-practice.in");
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader br = new BufferedReader(inputStreamReader);
		int numCases = Integer.parseInt(br.readLine()); 
		for (int i = 0; i < numCases; i++) {
			Googlers googlers = new Googlers(br.readLine());
			System.out.println(String.format("Case #%1$d: %2$s ", i+1, googlers.calculateTripletsBestResult()));
		}
		br.close();
		inputStreamReader.close();
		inputStream.close();
	}

	/**
	 * @param input a line of the input, format: N S P t1 t2 ... tN
	 * Where: 
	 * N is the number of triplets (1 ≤ T ≤ 100)
	 * S is the number of surprising scores (0 ≤ S ≤ N)
	 * P is the maximun puntuation (0 ≤ p ≤ 10)
	 * t is the sum of each triplets
	 * Example: 3 1 5 15 13 11 
	 */
	public Googlers (String input) {
		String[] split = input.split(" ");
		int triplets = Integer.parseInt(split[0]);
		surprising = new Integer(split[1]);
		scoreReference = new Integer(split[2]);
		scores = new ArrayList<Integer>();
		for (int i = 0; i < triplets; i++) {
			scores.add(Integer.parseInt(split[i+3]));
		}
	}

	public Integer getScoreReference() {
		return scoreReference;
	}
	public void setScoreReference(Integer scoreReference) {
		this.scoreReference = scoreReference;
	}	
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

	/**
	 * Algorithm
	 * @return
	 */
	public int calculateTripletsBestResult(){
		int triplets = 0;
		int surprisings = this.getSurprising();
		for (Integer myInt : this.getScores()) {
			int maxResult = myInt / 3;
			if (myInt % 3 > 0) {
				maxResult++;
			}
			if (maxResult >= this.getScoreReference()) {
				triplets++;
			} else {
				/* my be a surprising score */
				if (surprisings>0 && myInt>0) {
					if (myInt%3==0 || myInt%3==2) {
						maxResult++;
					}
				}
				if (maxResult >= this.getScoreReference()) {
					triplets++;
					surprisings--;
				}
			}
		}
		return triplets;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

package com;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Google Code Jam 2012 - Qualification Round exercise D.
 * @see <a href="http://code.google.com/codejam/contest/1460488/dashboard#s=p3">Hall of Mirrors</a> 
 * @author antonio.diaz.arroyo@gmail.com
 */

public class Mirror {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		InputStream inputStream = Mirror.class.getResourceAsStream("D-small-practice.in");
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bf = new BufferedReader(inputStreamReader);
		int cases = Integer.parseInt(bf.readLine());
		for (int i = 0; i < cases; i++) {
			String firstLine = bf.readLine();
			int h = Integer.parseInt(firstLine.split(" ")[0]);
			StringBuilder stb = new StringBuilder();
			for (int j = 0; j < h; j++) {
				stb.append(bf.readLine());
			}
			Mirror myMirror = new Mirror(firstLine, stb.toString());
			int reflections = myMirror.calculateReflections();
			System.out.println(myMirror.toString());
			System.out.println(String.format("Case #%1$d: %2$s ", i+1, reflections));
		}
		bf.close();
		inputStreamReader.close();
		inputStream.close();
	}
	
	private int height;
	private int width;
	private int distance;
	private byte[][] grid; 
	
	public Mirror (String gridDates, String gridStr) {
		height = Integer.parseInt(gridDates.split(" ")[0]);
		width = Integer.parseInt(gridDates.split(" ")[1]);
		distance = Integer.parseInt(gridDates.split(" ")[2]);
		grid = new byte[height][width];
		for (int row = 0; row < height; row++) {
			for (int column = 0; column < width; column++) {
				grid[row][column] = (byte)gridStr.charAt(column+(row*width));
			}
		}
	}
	
	public int calculateReflections(){
		System.out.println(this.toString());
		return -1;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public byte[][] getGrid() {
		return grid;
	}


	public void setGrid(byte[][] grid) {
		this.grid = grid;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

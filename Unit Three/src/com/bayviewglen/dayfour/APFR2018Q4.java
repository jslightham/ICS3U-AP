package com.bayviewglen.dayfour;

public class APFR2018Q4 {

	public static void main(String[] args) {
		int[][] arr2d = new int[5][6];
		int x = 0;
		
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				arr2d[i][j] = x;
				x++;
			}
		}

		int[] result = getColumn(arr2d, 1);
	}
	
	public static void questionTwo() {
		int[][] x = {{1,2,3}, {2,3,1}, {3,1,2}};
		
		isLatinSquare;
	}
	
	public static int[] getColumn(int[][] arr2d, int c) {
		int[] x = new int[arr2d.length];
		
		for(int i = 0; i<x.length; i++) {
			x[i] = arr2d[i][c];
		}
		return x;
	}
	
	

}

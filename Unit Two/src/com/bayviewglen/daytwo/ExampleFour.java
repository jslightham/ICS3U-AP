package com.bayviewglen.daytwo;

public class ExampleFour {

	public static void main(String[] args) {
		// display a grid of 3 x 5 dots
				//3 rows of 5 dots
				
				final int NUM_ROWS = 3;
				final int NUM_COLS = 5;
				
				for(int j = 0; j < NUM_COLS; j++) {
					for(int i =0; i < NUM_COLS; i++) {
						System.out.print(".");
					}
					System.out.println();
				}

	}

}

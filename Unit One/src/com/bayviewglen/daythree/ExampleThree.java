package com.bayviewglen.daythree;

public class ExampleThree {
	/*
	 * Three types of Errors
	 */
	public static void main(String[] args) {
		//ints x, y; // syntax error - Your Java is wrong. Java does not understand your code.
				   // Will not run if you have syntax errors
		
		
		// Run-Time Errors - Errors that occur at run time.
		int x = 7;
		//int y = x / 0;
		
		// Logic Errors
		int r = 7;
		double areaCircle = Math.PI * 2 * r; // Logic mistake because the equation is wrong 
											 // These are more like glitches
											 // Difficult to find and generally get missed 
		System.out.println(areaCircle);		 	
	}
}

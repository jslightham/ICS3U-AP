package com.bayviewglen.daythree;

public class ExampleFour {
	public static void main(String[] args) {
		final int NUMBER_OF_SIDES = 6;
		final int NUM_STUDENTS = 22;
		int testScores = 0;
		int[] students = new int[NUM_STUDENTS];
		for(int i = 0; i < NUM_STUDENTS; i++) {
			testScores += students[i]; // Add Student score to testScore (testScores + Students[i])
		}
		
		double average = testScores / (double)NUM_STUDENTS;
		
		// NUMBER_OF_SIDES = 8; Cannot do this.
		// Naming convention for constants is UPPER_CASE_WITH_UNDERSCORES
		
		
		// hardcoded numbers in your code are referred to as magic numbers
		// we don't like magic numbers. Create a constant instead. 
		// Constants go at the top.
		
	}
	
	
}

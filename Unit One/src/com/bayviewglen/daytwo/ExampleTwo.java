package com.bayviewglen.daytwo;

/*
 * 1. Primitive Data - double
 * 2. Casting
 */
public class ExampleTwo {
	/*
	 * Get the average of 3 marks - get it twice.
	 */
	public static void main(String[] args) {
		double markOne = 10;
		double markTwo = 10;
		double markThree = 10;
		double averageMark = (markOne + markTwo + markThree) / 3; 	// double stores decimal values (also referred to
																	// floating point decimals)

																	// Note that even though the answer was 10 it displayed 10.0
																	// Because averageMark is a decimal value

		int testOne, testTwo, testThree;
		testOne = 70;
		testTwo = 75;
		testThree = 70;
		averageMark = (testOne + testTwo + testThree) / 3; 			// both operants are ints so we do integer division
																	// averageMark is a double so it displays as a decimal BUT an unexpected value

		// one solution to our problem
		averageMark = (testOne + testTwo + testThree) / 3.0; 		// one of the operands is a double so we do double division

		// one solution to our problem
		averageMark = (double) (testOne + testTwo + testThree) / 3; // cast the first operand as a double

		System.out.println("The average of the three marks was: " + averageMark);
	}
}

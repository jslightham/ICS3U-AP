package com.bayviewglen.daytwo;

/*
 * Topics Covered:
 * 1. Declaring Variables
 * 2. Primitive data types
 * 3. Assignment Operator
 * 4. String Concatenation
 * 5. Ctrl + Shift + f - auto indent/format (Select all First)
 */
public class ExampleOne {

	public static void main(String[] args) {
		int x = 27;	// x and y will store ints
		int y;
		y = 23;
		int z; // sum of x and y
		
		z = x + y; // z is assigned x + y
		System.out.println(z); // displays the value stored in z to console
		
		
		// declare variables where you need them the first time
		
		int numberOne, numberTwo; // you can declare multiple variables on the same line as long as they are the same type
		numberOne = 18;
		numberTwo = 19;
		
		int sum = numberOne + numberTwo; // we can declare and initialize on the same line 
		
		System.out.println(numberOne + " + " + numberTwo + " = " + sum);
	}

}

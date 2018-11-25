package com.bayviewglen.daytwo;

public class ExampleOne {

	public static void main(String[] args) {
		/*
		 * 1. int i =0;		initializes the counter
		 * 2. i < 10; 		condition (boolean condition that will evaluate true or false)
		 * 3. i++			how do we modify the counter
		 * 4. 				Body
		 * 		 */
		for(int i = 0; i <= 9; i++) {
			System.out.println(i);
		}

		
		for(int i =0; i <= 9; i++) { // 10
			if(i%2==0) System.out.println(i); //10
		}
		for(int i = 0; i <=9; i+=2) { // 5
			System.out.println(i); // 5
		}
		/*
		int i = 0;
		while(i<10) {
			System.out.println(i++);
		}
		*/
		
		
		
	}

}

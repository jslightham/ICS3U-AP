package com.bayviewglen.daythree;

public class ExampleOne {

	/*
	 * Integer Division
	 */
	public static void main(String[] args) {
		int x = 345;
		int y = 17;
		
		double z = x / y;
		
		System.out.println(z);
		
		int remainder = x % y;
		
		System.out.println("The remainder is: " + remainder);
		
		if(x % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		if(x % 3 == 0) {
			System.out.println(x + " Is divisible by 3.");
		}else {
			System.out.println(x + " Is not divisible by 3.");
		}
		
		for(int i = 0; i < 100; i++) {
			if(i % 9 == 0) {
				System.out.println(i);
			}
		}
	}

}

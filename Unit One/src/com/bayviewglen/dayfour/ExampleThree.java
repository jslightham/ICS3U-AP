package com.bayviewglen.dayfour;

import java.util.Scanner;

public class ExampleThree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input a 3 digit number: ");
		int n = in.nextInt();
		
		/*
		if(n > 999 || n < 100) {
			throw new IllegalArgumentException("The number must be 3 digits");
		}
		*/
		while(n > 999 || n < 100) {
			System.out.println("Please input a 3 digit number: ");
			n = in.nextInt();	
		}
		
		int a = n / 100;
		int c = n % 10;
		int b = (n / 10) % 10;
		int sum = a + b + c;
		
		System.out.println("The sum is: " + sum);
		
		in.close();

	}
	

}

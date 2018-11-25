package com.bayviewglen.dayone;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = in.nextInt();
		
		// check if x is between 1 and 10 inclusive
		if(num > 1 && num <= 10) {
			System.out.println("The number is between 1 and 10");
		}
	}

}

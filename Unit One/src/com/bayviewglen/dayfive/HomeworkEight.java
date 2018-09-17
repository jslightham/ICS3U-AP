package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkEight {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a positive number: ");
		double number = in.nextInt();
		System.out.println("The square root is: " + Math.sqrt(number));
		System.out.println("The square is: " + Math.pow(Math.abs(number), 2));
		
	}

}

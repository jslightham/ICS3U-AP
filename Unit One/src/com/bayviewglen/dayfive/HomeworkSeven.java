package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkSeven {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Temperature in F: ");
		double temp = in.nextDouble();
		
		double c = (temp - 32) * 0.5556;
		
		System.out.print("The Temperature in C is: " + c);
		
	}
}

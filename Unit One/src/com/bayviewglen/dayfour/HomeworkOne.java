package com.bayviewglen.dayfour;

import java.util.Scanner;

public class HomeworkOne {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		questionOne(in);
		questionTwo(in);
		questionThree(in);
		questionFour(in);
	}
	public static void questionOne(Scanner in) {
		System.out.print("Please enter an integer: ");
		int n = in.nextInt();
		double square = Math.pow(n, 2);
		System.out.println("The Square of " + n + " is: " + square);
	}
	public static void questionTwo(Scanner in) {
		System.out.print("Please enter test score: ");
		int score = in.nextInt();
		System.out.print("Please enter what the test is out of: ");
		int outOf = in.nextInt();
		double percent = ((double)score / outOf) * 100;
		System.out.println("Test Score: " + percent);
		
	}
	public static void questionThree(Scanner in) {
		System.out.print("Please enter a 5 digit number: ");
		int num = in.nextInt();
			int a = (num / 1000) % 10;
			int b = (num / 10) % 10;
			int product = a * b;
			System.out.println("The product is: " + product);
		
	}
	public static void questionFour(Scanner in) {
		System.out.print("Please enter the initial velocity: ");
		double initialVelocity = in.nextDouble();
		System.out.print("Please enter the acceleration: ");
		double acceleration = in.nextDouble();
		System.out.print("Please enter the elapsed time: ");
		double elapsedTime = in.nextDouble();
		
		double finalVelocity = initialVelocity + acceleration*elapsedTime;
		System.out.println("The final velocity of the car is: " + finalVelocity);
	}
}

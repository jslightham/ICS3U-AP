package com.bayviewglen.daythree;

public class ExampleTwo {
	public static void main(String[] args) {
		int number = 12345;
		
		//Add the individual digits in the number;
		
		int digit1 = number / 10000; 
		int digit5 = number % 10;
		int digit2 = number / 1000 % 10;
		int digit3 = number / 100 % 10; 
		int digit4 = number % 100 /10;
		
		String numbers = number + "";
		char test = numbers.charAt(3);
		
		int sum = digit1 + digit2 + digit3 + digit4 + digit5;
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
}

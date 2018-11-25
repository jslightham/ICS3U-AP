package com.bayviewglen.dayfive;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		/*
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		double x = in.nextDouble();
		System.out.println("The cube of " + x + " is " + cube(x));
		in.close();
		*/
		
		int y = 10;
		System.out.println("Before mystery: " + y);
		y = mystery2(y);
		System.out.println("After mystery: " + y);
		
		for(int i = 0; i < 10; i++) {
			System.out.println(roll());		
		}
	}
	
	// for now all of our methods will be static and public
	// public static returnType methodName(parameterList){...
	public static double cube(double num) {
		return num * num * num;
	}
	
	// void means we are not returning a value
	public static void mystery(int x) {
		System.out.println("Inside mystery before x++: " + x);
		x++;
		System.out.println("Inside mystery after x++: " + x);
	}
	
	public static int mystery2(int x) {
		x++;
		return x;
	}
	
	public static int roll() {
		return (int)(Math.random() * 6) + 1;
	}
	

}

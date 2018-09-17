package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter length: ");
		double length = in.nextDouble();
		
		System.out.print("Please enter width: ");
		double width = in.nextDouble();
		
		double ans = length * width;
		double perimiter = length * 2 + width * 2;
		
		System.out.println("The area of the rectangle is: " + ans);
		System.out.println("The perimiter of the rectangle is: " + perimiter);

	}

}

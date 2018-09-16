package com.bayviewglen.dayfour;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the length and width of the base: ") ;
		double length = in.nextDouble();
		double width = in.nextDouble();
		
		System.out.print("Please enter the height of the box: ");
		double height = in.nextDouble();
		
		double surfaceArea = (length*width)*2 + (length*height)*2 + (width*height)*2;
		
		System.out.println("\nThe surface area of the box is: " + surfaceArea);

		in.close();
	}

}

package com.bayviewglen.dayfour;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, y, z;
		System.out.print("Please enter three integers: " );
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		
		double average = (x + y + z) / 3.0;
		System.out.println("The average of the three numbers is: " + average);
		
		input.close();
	}

}

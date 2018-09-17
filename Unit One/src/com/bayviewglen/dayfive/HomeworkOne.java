package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter purchase price: ");
		double price = in.nextDouble();
		System.out.print("Please enter sales tax %: ");
		double tax = in.nextDouble();
		
		double ans = price * tax;
		System.out.println("The total purchase price is: " + ans);
		
	}
}

package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Numer of items sold: ");
		int numSold = in.nextInt();
		double pay = numSold * 0.27;
		
		System.out.println("Pay: " + pay);
		
	}

}

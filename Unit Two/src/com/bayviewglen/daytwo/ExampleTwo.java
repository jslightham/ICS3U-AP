package com.bayviewglen.daytwo;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Runner 1
		System.out.print("Please enter your first and last name: ");
		String runnerOneName = in.nextLine(); 
		System.out.printf("%s, Please enter your Mile One time (mm:ss.sss): ", runnerOneName);
		String temp = in.nextLine();
		int minutes;
		double seconds;
		int colon = temp.indexOf(":");
		minutes = Integer.parseInt(temp.substring(0, colon));
		seconds = Double.parseDouble(temp.substring(colon+1));
		double mileOneTime = minutes * 60 + seconds;
		System.out.println(mileOneTime);
		
		
		
		// assume minutes = 5
		// assume seconds = 34.221
		
		// total time = 334.221
		// split total time into mins:seconds
		// minutes * 60 + seconds
		// minutes / 60 - seconds
		

	}

}

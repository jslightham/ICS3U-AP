package com.bayviewglen.assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Runner 1
		System.out.print("Please enter your first and last name: ");
		String runnerOneName = in.nextLine(); 
		String runnerOneFirstName = runnerOneName.substring(0, runnerOneName.indexOf(" "));
		String runnerOneLastName = runnerOneName.substring(runnerOneName.indexOf(" "));
		// Split One
		System.out.printf("%s, Please enter your Mile One time (mm:ss.sss): ", runnerOneFirstName);
		String temp = in.nextLine();
		double runnerOneSplitOne = toSeconds(temp);	
		// Split Two
		System.out.printf("%s, Please enter your time to the end of the second mile: ", runnerOneFirstName);
		temp = in.nextLine();
		double runnerOneSplitTwo = toSeconds(temp);
		// Split Three
		System.out.printf("%s, Please enter your time to the end of the third mile: ", runnerOneFirstName);
		temp = in.nextLine();
		double runnerOneSplitThree = toSeconds(temp);
		// Print all information
		printSummary(runnerOneSplitOne, runnerOneSplitTwo, runnerOneSplitThree, "One", runnerOneFirstName, runnerOneLastName);
		
		
		// Runner 2
		System.out.println("\n");
		System.out.print("Please enter your first and last name: ");
		String runnerTwoName = in.nextLine(); 
		String runnerTwoFirstName = runnerTwoName.substring(0, runnerTwoName.indexOf(" "));
		String runnerTwoLastName = runnerTwoName.substring(runnerTwoName.indexOf(" "));
		// Split One
		System.out.printf("%s, Please enter your Mile One time (mm:ss.sss): ", runnerTwoFirstName);
		temp = in.nextLine();
		double runnerTwoSplitOne = toSeconds(temp);	
		// Split Two
		System.out.printf("%s, Please enter your time to the end of the second mile: ", runnerTwoFirstName);
		temp = in.nextLine();
		double runnerTwoSplitTwo = toSeconds(temp);
		// Split Three
		System.out.printf("%s, Please enter your time to the end of the third mile: ", runnerTwoFirstName);
		temp = in.nextLine();
		double runnerTwoSplitThree = toSeconds(temp);
		// Print all information
		printSummary(runnerTwoSplitOne, runnerTwoSplitTwo, runnerTwoSplitThree, "Two", runnerTwoFirstName, runnerTwoLastName);
	
		// Runner 3
		System.out.println("\n");
		System.out.print("Please enter your first and last name: ");
		String runnerThreeName = in.nextLine(); 
		String runnerThreeFirstName = runnerThreeName.substring(0, runnerThreeName.indexOf(" "));
		String runnerThreeLastName = runnerThreeName.substring(runnerThreeName.indexOf(" "));
		// Split One
		System.out.printf("%s, Please enter your Mile One time (mm:ss.sss): ", runnerThreeFirstName);
		temp = in.nextLine();
		double runnerThreeSplitOne = toSeconds(temp);	
		// Split Two
		System.out.printf("%s, Please enter your time to the end of the second mile: ", runnerThreeFirstName);
		temp = in.nextLine();
		double runnerThreeSplitTwo = toSeconds(temp);
		// Split Three
		System.out.printf("%s, Please enter your time to the end of the third mile: ", runnerTwoFirstName);
		temp = in.nextLine();
		double runnerThreeSplitThree = toSeconds(temp);
		// Print all information
		printSummary(runnerThreeSplitOne, runnerThreeSplitTwo, runnerThreeSplitThree, "Three", runnerThreeFirstName, runnerThreeLastName);
	
	
		// Runner 4
		System.out.println("\n");
		System.out.print("Please enter your first and last name: ");
		String runnerFourName = in.nextLine(); 
		String runnerFourFirstName = runnerFourName.substring(0, runnerFourName.indexOf(" "));
		String runnerFourLastName = runnerFourName.substring(runnerFourName.indexOf(" "));
		// Split One
		System.out.printf("%s, Please enter your Mile One time (mm:ss.sss): ", runnerFourFirstName);
		temp = in.nextLine();
		double runnerFourSplitOne = toSeconds(temp);	
		// Split Two
		System.out.printf("%s, Please enter your time to the end of the second mile: ", runnerFourFirstName);
		temp = in.nextLine();
		double runnerFourSplitTwo = toSeconds(temp);
		// Split Three
		System.out.printf("%s, Please enter your time to the end of the third mile: ", runnerFourFirstName);
		temp = in.nextLine();
		double runnerFourSplitThree = toSeconds(temp);
		// Print all information
		printSummary(runnerFourSplitOne, runnerFourSplitTwo, runnerFourSplitThree, "Four", runnerFourFirstName, runnerFourLastName);
	
		// Runner 5
		System.out.println("\n");
		System.out.print("Please enter your first and last name: ");
		String runnerFiveName = in.nextLine(); 
		String runnerFiveFirstName = runnerFiveName.substring(0, runnerFiveName.indexOf(" "));
		String runnerFiveLastName = runnerFiveName.substring(runnerFiveName.indexOf(" "));
		// Split One
		System.out.printf("%s, Please enter your Mile One time (mm:ss.sss): ", runnerFiveFirstName);
		temp = in.nextLine();
		double runnerFiveSplitOne = toSeconds(temp);	
		// Split Two
		System.out.printf("%s, Please enter your time to the end of the second mile: ", runnerFiveFirstName);
		temp = in.nextLine();
		double runnerFiveSplitTwo = toSeconds(temp);
		// Split Three
		System.out.printf("%s, Please enter your time to the end of the third mile: ", runnerFiveFirstName);
		temp = in.nextLine();
		double runnerFiveSplitThree = toSeconds(temp);
		// Print all information
		printSummary(runnerFiveSplitOne, runnerFiveSplitTwo, runnerFiveSplitThree, "Five", runnerFiveFirstName, runnerFiveLastName);
	
	
	}
	
	/*
	 * Convert given string to seconds
	 * Using minutes * 60 + seconds
	 */
	public static double toSeconds(String temp) {
		int minutes;
		double seconds;
		int colon;
		colon = temp.indexOf(":");
		minutes = Integer.parseInt(temp.substring(0, colon));
		seconds = Double.parseDouble(temp.substring(colon+1));
		double time = minutes * 60 + seconds;
		return time;
	}
	// get seconds value in original form
	public static double getSeconds(double sec) {
		double minutes = sec/60;
		String decimal = "0" + String.valueOf(minutes).substring(String.valueOf(minutes).indexOf("."));
		String secondPart = String.valueOf(60 * Double.parseDouble(decimal));
		return Double.parseDouble(secondPart);
	}
	// Get minutes value in original form
	public static int getMinutes(double sec) {
		double minutes = sec/60;
		String firstPart = String.valueOf((int)minutes);
		return Integer.parseInt(firstPart);
	}
	// Print out runner summary 
	public static void printSummary(double splitOne, double splitTwo, double splitThree, String runnerNumber, String runnerFirstName, String runnerLastName) {
		System.out.println("Runner " + runnerNumber + " Summary");
		System.out.println("******************\n");
		System.out.println("Runner: " + runnerLastName.substring(1) + ", " + runnerFirstName);
		System.out.printf("Split One: %02d:%06.3f\n", getMinutes(splitOne), getSeconds(splitOne));
		System.out.printf("Split Two: %02d:%06.3f\n", getMinutes(splitTwo - splitOne), getSeconds(splitTwo - splitOne));
		System.out.printf("Split Three: %02d:%06.3f\n", getMinutes(splitThree - splitTwo), getSeconds(splitThree - splitTwo));
		System.out.printf("Total: %02d:%06.3f", getMinutes(splitThree), getSeconds(splitThree));
		
	}
}
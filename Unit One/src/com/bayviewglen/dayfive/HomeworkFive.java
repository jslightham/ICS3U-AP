package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFive {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter # of games won: ");
		int gamesWon = in.nextInt();
		System.out.print("Enter # of games lost: ");
		int gamesLost = in.nextInt();
		
		double sum = gamesWon + gamesLost;
		double percentage = gamesWon / sum;
		
		System.out.print("The winning percentage is: " + percentage*100 + "%");
		
	}
}

package com.bayviewglen.dayfive;

import java.util.Scanner;

public class ExampleTwo {
	// Two player Game.
	// Player 1 and Player 2
	// First to go over 50 wins
	// Option to roll 1 or 2 dice
	// if you roll a 4 or 10 you lose 5
	public static void main(String[] args) {
		
		int playerOneScore = 0;
		int playerTwoScore = 0; 
		final int GOAL = 50;
		Scanner in = new Scanner(System.in);
		
		boolean gameOver = false;
		
		
		while(!gameOver) {
			playerOneScore = playerTurn("Player One", playerOneScore, in);
			playerTwoScore = playerTurn("Player Two", playerTwoScore, in);
			
			displayScore("Player One", playerOneScore);
			displayScore("Player Two", playerTwoScore);
			
			if(playerOneScore > GOAL || playerTwoScore > GOAL) gameOver = true;
		}
		displayWinner("Player One", playerOneScore, "Player Two", playerTwoScore);
		in.close();
	}
	
	public static void displayWinner(String playerOneName, int playerOneScore, String playerTwoName, int playerTwoScore) {
		if(playerOneScore == playerTwoScore) System.out.println("Tie");
		if(playerOneScore > playerTwoScore) System.out.println(playerOneName + " Wins");
		if(playerOneScore < playerTwoScore) System.out.println(playerTwoName + " Wins");
	}

	public static void displayScore(String playerName, int playerScore) {
		System.out.println(playerName + " score is: " + playerScore);
		
	}

	public static int playerTurn(String name, int score, Scanner in) {
		
		System.out.print(name + ", how many dice will you roll (1 or 2)?");
		
		int numDice = getNumDice(in);
		
		
		int playerTurn = 0; 
		for(int i = 0; i < numDice; i++) {
			int currentRoll = ExampleOne.roll();
			playerTurn += currentRoll;
			System.out.println(name + ", you rolled a: " + currentRoll);
			if(playerTurn == 4 || playerTurn == 10) {
				score -= 5;
				System.out.println("Player loses 5 points.");
			}
			else
				score += currentRoll;
		}
		
		
		return score;
	}

	private static int getNumDice(Scanner in) {
		boolean isValid = false;
		int x = 0;
		
		while(!isValid) {
			try{
				x = Integer.parseInt(in.nextLine());
				if(x < 1 || x > 2) System.out.print("Please enter an integer (1 or 2): ");
				else isValid = true;
			}catch(Exception e) {
				System.out.print("Please enter an integer (1 or 2): ");
			}
		}
		return x;
	}

}
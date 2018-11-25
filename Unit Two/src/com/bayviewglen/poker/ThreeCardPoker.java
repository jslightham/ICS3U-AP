package com.bayviewglen.poker;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeCardPoker {
	public static final int NUM_FACES = 4;
	public static final int NUM_SUITS = 13;
	public static final int NUM_CARDS = 3;
	public static int playerWallet = 500;
	public static int pairPlusWager;
	public static String playerHand = "";
	public static String dealerHand = "XX XX XX";
	public static boolean isGameOver = false;
	public static boolean isRoundOver = false;
	private static final int STRAIGHT_FLUSH = 40;
	private static final int THREE_OF_A_KIND = 30;
	private static final int STRAIGHT = 6;
	private static final int FLUSH = 3;
	private static final int PAIR = 1;
	private static final int HIGH_CARD = 0;


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anteWager;
		while (!isGameOver) {
			isRoundOver = false;
			while (!isRoundOver) {
				anteWager = 0;
				playerHand = "";
				pairPlusWager = 0;
				
				System.out.println("Your wallet value is: $" + playerWallet);
				System.out.print("What is your Ante Wager bet? ($50-$100): ");
				anteWager = validBet(100, 50, in);

				// Check to see if valid bet

				System.out.print("Do you want a Pair Plus wager? (Yes or No): ");
				boolean isValidResponse = false;
				while (!isValidResponse) {
					String temp = in.nextLine().toLowerCase();
					if (temp.equals("yes") || temp.equals("no") || temp.equals("y") || temp.equals("n")) {
						isValidResponse = true;
						if (temp.equals("yes") || temp.equals("y")) {
							System.out.print("What is your Pair Plus Wager bet? ($50-$100): ");
							pairPlusWager = validBet(100, 50, in);
						}
					} else
						System.out.println("Please enter a valid response (Yes or No)");
				}

				for (int i = 0; i < NUM_CARDS; i++) {
					playerHand += getCard() + " ";
				}

				System.out.println("Your Hand: " + playerHand);
				System.out.println("Dealer's Hand: " + dealerHand);

				System.out.print("Do you want to place a Play Wager?: ");

				isValidResponse = false;
				while (!isValidResponse) {
					String temp = in.nextLine().toLowerCase();
					if (temp.equals("yes") || temp.equals("no") || temp.equals("y") || temp.equals("n")) {
						isValidResponse = true;
						if (playerWallet < 1) {
							roundOver(0, in);
						} else if (temp.equals("yes") || temp.equals("y")) {
							System.out.print("What is your Play Wager be? ($50-$100): ");
							pairPlusWager = validBet(100, 50, in);
						} else if (temp.equals("no") || temp.equals("n")) {
							roundOver(0, in);
						}
					} else
						System.out.println("Please enter a valid response (Yes or No)");
				}

				dealerHand = "";
				for (int i = 0; i < NUM_CARDS; i++) {
					dealerHand += getCard() + " ";
				}

				System.out.println("Dealer Hand: " + dealerHand);
				System.out.println("Player Hand: " + playerHand);

				String[] playerHandArr = new String[3];
				playerHandArr = playerHand.split(" ");
				int[] playerHandValue = new int[playerHandArr.length];
				for (int i = 0; i < playerHandArr.length; i++) {
					try {
						playerHandValue[i] = Integer.parseInt(playerHandArr[i].substring(0, 1));
					} catch (Exception e) {
						if (playerHandArr[i].substring(0, 1).equals("A"))
							playerHandValue[i] = 14;
						if (playerHandArr[i].substring(0, 1).equals("J"))
							playerHandValue[i] = 11;
						if (playerHandArr[i].substring(0, 1).equals("Q"))
							playerHandValue[i] = 12;
						else
							playerHandValue[i] = 13;
					}
					
				}
				Arrays.sort(playerHandValue);
			}
		}
	}

	// Check if bet is valid
	public static int validBet(int upperLimit, int lowerLimit, Scanner in) {
		boolean isValidBet = false;
		while (!isValidBet) {
			try {
				String temp = in.nextLine();
				int bet = Math.abs(Integer.parseInt(temp));
				if ((bet <= upperLimit && bet >= lowerLimit) && bet <= playerWallet) {
					isValidBet = true;
					playerWallet -= bet;
					return bet;
				}
				if (bet > playerWallet) {
					System.out.println("The amount you bet is greater than the amount in your wallet.");
					System.out.println("Wallet: " + playerWallet);
					System.out.print("Please Enter Valid Bet ($" + lowerLimit + "-$" + upperLimit + "): ");
				} else
					System.out.print("Please Enter Valid Bet ($" + lowerLimit + "-$" + upperLimit + "): ");
			} catch (Exception e) {
				System.out.print("Please Enter Valid Bet ($" + lowerLimit + "-$" + upperLimit + "): ");
			}
		}
		return 0;
	}

	public static String getCard() {
		boolean uniqueCard = false;
		String card = "";
		while (!uniqueCard) {
			card = getFace() + getSuit();
			if ((playerHand.indexOf(card) == -1 || playerHand.indexOf(card) == -1)
					&& (dealerHand.indexOf(card) == -1 || dealerHand.indexOf(card) == -1)) {
				uniqueCard = true;
			}
		}
		return card;
	}

	public static String getFace() {
		int x = (int) (Math.random() * NUM_FACES) + 2;

		if (x <= 10)
			return "" + x;
		else if (x == 11)
			return "J";
		else if (x == 12)
			return "Q";
		else if (x == 13)
			return "K";
		else
			return "A";

	}

	public static String getSuit() {
		int x = (int) (Math.random() * NUM_SUITS);
		if (x == 0)
			return "S";
		else if (x == 1)
			return "D";
		else if (x == 1)
			return "H";
		else
			return "C";
	}

	public static void roundOver(int condition, Scanner in) {
		if (playerWallet < 1) {
			System.out.println("Game Over, Out of money!");
			isGameOver = true;
			return;
		} else if (condition == 0) {
			System.out.println("Player Folds, Round Over!");
			isRoundOver = true;
		}

		System.out.print("Do you want to play again?: ");
		boolean isValidResponse = false;
		while (!isValidResponse) {
			String temp = in.nextLine().toLowerCase();
			if (temp.equals("yes") || temp.equals("no") || temp.equals("y") || temp.equals("n")) {
				isValidResponse = true;
				if (temp.equals("yes") || temp.equals("y")) {
					System.out.print("What is your Pair Plus Wager bet? ($50-$100): ");
					pairPlusWager = validBet(100, 50, in);
				}
			} else
				System.out.println("Please enter a valid response (Yes or No)");
		}

	}

	public static int getHandValue(int[] handValue, String[] hand) {
		int value = 0;
		if ((handValue[0] == ++handValue[1] && handValue[1] == ++handValue[2]) ) {
			value += STRAIGHT_FLUSH;
			value += handValue[0] + handValue[1] + handValue[2];
		}
		else if(handValue[0] == handValue[1] && handValue[0] == handValue[2] && handValue[1] == handValue[2]) {
			value += THREE_OF_A_KIND;
			value += handValue[0] + handValue[1] + handValue[2];
		}
		else if((hand[0].contains("D") && hand[1].contains("D") && hand[2].contains("D")) || (hand[0].contains("C") && hand[1].contains("C") && hand[2].contains("C")) || (hand[0].contains("H") && hand[1].contains("H") && hand[2].contains("H")))
			
			
		return value;
		
	}

}

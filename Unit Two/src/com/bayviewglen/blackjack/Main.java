package com.bayviewglen.blackjack;

import java.util.Scanner;

public class Main {
	
	public static int playerHandValue;
	public static int numAces;
	public static String playerHand; 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		numAces = 0;
		playerHandValue = 0;
		int playerHandValueLowAce = 0;
		
		System.out.println(getCard());
		
		// Gives us 4 cards
		for(int i = 0; i<4; i++) {
			
		}
	

	}
	public static String getCard() {
		return getFace() + getSuit();
	}
	
	
	public static String getSuit() {
		
		String face = "";
		int selector = (int)(Math.random()*4);
		switch (selector) {
		case 0:
			face = "D";
			break;
		case 1:
			face = "H";
			break;
		case 2:
			face = "C";
			break;
		case 3:
			face = "S";
			break;
		}
		return face;
	}
	
	public static String getFace() {
		int selector = (int)(Math.random()*12);
		if(selector == 0) return "J";
		if(selector == 1) return "Q";
		if(selector >= 2 && selector <= 10) return String.valueOf(selector);
		if(selector == 11) return "K";
		return "A";
	}
	
	public static boolean isAce(String card) {
		return card.substring(0, 1).equals("A");
	}
	
	public static int getCardValue() {
		
	}

}

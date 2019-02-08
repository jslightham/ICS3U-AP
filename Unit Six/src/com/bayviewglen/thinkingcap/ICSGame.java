package com.bayviewglen.thinkingcap;

public class ICSGame {

	public static void main(String[] args) {
		Dice die1 = new Dice(6);
		Dice die2 = new Dice();
		
		int numPairs = 0;
		int numTimes = 0;
		while(numPairs != 5) {
			numPairs = 0;
		for(int i=0; i<5; i++) {
			die1.roll();
			die2.roll();
			System.out.println("Die 1: " + die1.getTopSide() + " Die 2: " + die2.getTopSide());
			if(die1.equals(die2))
				numPairs++;
		}
		System.out.println("Number of pairs: " + numPairs);
		numTimes++;
	}
		System.out.println(numTimes);
	}

}

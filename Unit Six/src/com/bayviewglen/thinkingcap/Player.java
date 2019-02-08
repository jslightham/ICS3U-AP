package com.bayviewglen.thinkingcap;

public class Player {
	private String playerName;
	private Dice dice;
	private int numPairs;
	
	public Player(String playerName) {
		this.playerName = playerName;
		this.numPairs = 0;
		this.dice = Dice.getInstance();
	}

	public void incrementNumPairs(){
		numPairs++;
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public int getNumPairs() {
		return numPairs;
	}
	
	/* True if you got a pair */
	public boolean takeTurn(){
		dice.roll();
		System.out.println(dice.displayRoll());
		if (dice.isPair()){
			incrementNumPairs();
			return true;
		}
		else
			return false;
	}
	
}

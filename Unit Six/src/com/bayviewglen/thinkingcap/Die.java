package com.bayviewglen.thinkingcap;

public class Die {
	private int topSide;
	private int numSides;
	public Die(int numSides) {
		this.numSides = numSides;
	}
	public Die() {
		this.numSides = 6;
	}
	
	public void roll() {
		topSide =  (int)(Math.random()*numSides + 1);
	}
	public int getTopSide() {
		return topSide;
	}
}

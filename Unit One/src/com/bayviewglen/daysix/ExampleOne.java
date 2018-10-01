package com.bayviewglen.daysix;

public class ExampleOne {

	public static void main(String[] args) {
		double x = Math.random();
		//System.out.println(x);
		
		//We want a number from 0 to 9 (integer)
		
		//x = (int)(Math.random() * 10);
		//System.out.println(x);
		
		//what if we want a number from 1 to 10?
		
		//x = (int)(Math.random() * 10) + 1;
		//System.out.println(x);
		
		final int LOWER_BOUND = -10;
		final int UNIQUE_NUMBERS = 21;
		int [] arr = new int[UNIQUE_NUMBERS];
		for(int i = 0; i < 100; i++) {
		x = (int)(Math.random() * UNIQUE_NUMBERS) + LOWER_BOUND;
		arr[(int) (x + (-LOWER_BOUND))]++;
		System.out.println(x);
		}

	}

}

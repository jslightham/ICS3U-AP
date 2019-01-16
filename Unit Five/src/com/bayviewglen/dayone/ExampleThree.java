package com.bayviewglen.dayone;

import java.util.ArrayList;

public class ExampleThree {

	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		
		for(int i = 0; i<10; i++) {
			ints.add((int)(Math.random() * 10 + 1));
			
			
		}
		
		System.out.println("The numbers: " + ints);
		System.out.println("Size: " + ints.size());
		System.out.println("The sum: " + sumArrayList(ints));
		
	}
	
	public static int sumArrayList(ArrayList<Integer> nums) {
		int sum = 0;
		for(int x : nums) {
			sum += x;
		}
		
		return sum; 
	}

}

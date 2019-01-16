package com.bayviewglen.dayone;

public class ExampleThree {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 10, -2, 11 };
		
		int sum = getSum(arr);
		
		System.out.println("The sum of the array is: " + sum);
	}
	
	public static int getSum(int[] arr) {
		arr[0] = 3;
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
}

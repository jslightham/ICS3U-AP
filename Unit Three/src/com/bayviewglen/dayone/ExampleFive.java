package com.bayviewglen.dayone;

public class ExampleFive {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 6, 10, -2, 11 };
		
		int max = maxValue(arr);
		
		System.out.println("The max value is: " + max);
	}
	
	public static int maxValue(int[] arr) {
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
			
		}
		return max;
	}

	public static int maxValue2(int[] arr) {
		int maxIndex = 0;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		return arr[maxIndex];
	}
}

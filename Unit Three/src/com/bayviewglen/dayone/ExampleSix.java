package com.bayviewglen.dayone;

public class ExampleSix {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int averageIndex = 0;
		
		for(int i =0; i<100000; i++) {
			for(int j =0; j<100; j++) {
				arr[j] = j;
			}
			int value = (int)(Math.random()*100) +1;
			averageIndex =+ sequentialSearch(arr, value);
		}
		System.out.println(averageIndex);
		
		
	}
	
	public static int sequentialSearch(int[] arr, int value) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == value)
				return i;
			
		}
		return -1;
	}

}

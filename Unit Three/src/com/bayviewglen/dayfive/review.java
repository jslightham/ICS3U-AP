package com.bayviewglen.dayfive;

public class review {
	public static void main(String[] args) {
		int[] arr = {5, 9, 3, 1, 8, 5, 10, 59, 6, 0, 600, -10, 54, 32, 90, 60, 10, 4, 3, 2, 1};
		selectionSort(arr);
		for(int x : arr) {
			System.out.println(x + " ");
		}
		System.out.println(binarySearch(arr, 10));
	}
	
	public static void insertionSort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			int j;
			int temp = arr[i];
			for(j = i-1; j>=0 && temp < arr[j]; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}
	
	public static void selectionSort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			int minIndex = 0;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	public static int binarySearch(int[] arr, int value) {
		int rightIndex = arr.length-1;
		int leftIndex = 0;
		while(rightIndex > leftIndex) {
			int midIndex = leftIndex + (rightIndex-leftIndex)/2;
			if(arr[midIndex] == value) return midIndex;
			if(arr[midIndex] > value) rightIndex = midIndex - 1;
			else leftIndex = midIndex + 1;
		}
		return -1;
	}
}

package com.bayviewglen.daythree;

public class SortingSearchingAlgorithms {

	public static void main(String[] args) {
		int[] x = createArray(10);
		display(x);
		selectionSort(x);
		display(x);
		
		System.out.println();
		x = createArray(20);
		display(x);
		insertionSort(x);
		display(x);
		
		System.out.println(17 + " is located at index " + binarySearch(x, 17));

	}
	
	private static int binarySearch(int[] x, int i) {
		int low = 0;
		int high = x.length - 1;
		while(high >= low) {
			int mid = (high + low)/2;
			
			if(x[mid] == i) {
				return mid;
			}
			else if(x[mid] > i) {
				high = mid - 1;
			}
			else
				low = mid +1;
		}
		return 0;
	}

	public static void insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int j;
			for(j = i-1; j>=0 && temp < arr[j]; j--) {
				arr[j+1] = arr[j];
			}
			
			arr[j+1] = temp;
		}
		
	}

	public static void selectionSort(int[] arr){
		for (int i=0; i<arr.length-1; i++){
			int minIndex = i;
			for (int j = i+1; j<arr.length; j++){
				if (arr[minIndex] > arr[j])
					minIndex = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	public static void bubbleSort(int[] arr) {
		
	}
	

	
	
	public static int[] createArray(int size){
		int[] arr = new int[size];
		
		for (int i=0;i<arr.length; i++){
			arr[i] = (int)(Math.random() * 25);
		}
		
		return arr;
	}
	
	public static void display(int[] arr){
		for (int a : arr){
			System.out.print(a + " ");
		}
		System.out.println();
	}

}


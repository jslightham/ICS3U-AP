package com.bayviewglen.dayone;

public class ExampleTwo {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 10, -2, 11 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}

		arr = new int[3];
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}

	}

}

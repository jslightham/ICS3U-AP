package com.bayviewglen.daytwo;

public class ExampleThree {

	public static void main(String[] args) {
		String[] arr = { "Apple", "Pear", "Grape", "Almond" };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}

		System.out.println();

		int i = 0;
		for (String el : arr) {
			System.out.println(el);
			System.out.println(arr[i]);
			i++;

		}

	}
}

package com.bayviewglen.daytwo;

import java.util.Scanner;

public class ExampleFive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter M value");
		int M = in.nextInt();

		System.out.print("Please enter N value");
		int N = in.nextInt();

		System.out.print("Please enter P value");
		int P = in.nextInt();

		System.out.print("Please enter Q value");
		int Q = in.nextInt();

		for (int j = 0; j < Q; j++) {
			for (int i = 0; i < 2 * Q + 2 * P + N; i++) {
				System.out.print("#");
			}
		}
		System.out.println();
		for (int j = 0; j < P; j++) {
			for (int i = 0; i < Q; i++) {
				System.out.print("#");
			}
			for (int k = 0; k < N + 2 * P; k++) {
				System.out.print("+");
			}
			for (int i = 0; i < Q; i++) {
				System.out.print("#");
			}
		}
		System.out.println();
		for (int j = 0; j < P; j++) {
			for (int i = 0; i < Q; i++) {
				System.out.print("#");
			}
			for (int k = 0; k < P; k++) {
				System.out.print("+");
			}

			for (int i = 0; i < N; i++) {
				System.out.print(".");
			}
			for (int k = 0; k < P; k++) {
				System.out.print("+");
			}
			for (int i = 0; i < Q; i++) {
				System.out.print("#");
			}
		}
		System.out.println();

		for (int j = 0; j < P; j++) {
			for (int i = 0; i < Q; i++) {
				System.out.print("#");
			}
			for (int k = 0; k < N + 2 * P; k++) {
				System.out.print("+");
			}
			for (int i = 0; i < Q; i++) {
				System.out.print("#");
			}
		}
		System.out.println();

		for (int j = 0; j < P; j++) {
			for (int i = 0; i < 2 * Q + 2 * P + N; i++) {
				System.out.print("#");
			}
		}

	}

}

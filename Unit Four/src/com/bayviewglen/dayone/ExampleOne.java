package com.bayviewglen.dayone;

public class ExampleOne {
	public static int n = 5000;
	public static long[] solutions = new long[n+1];
	
	public static void main(String[] args) {
		
//		System.out.println(factorial(n));
		
		System.out.println(fibonacci(n));

	}

	private static long fibonacci(int n) {
		if(n == 1 || n == 2)
			return 1;
		else if (solutions[n] != 0)
			return solutions[n];
		else
			solutions[n] = fibonacci(n-1) + fibonacci(n-2);
			return solutions[n];
	}
	

	/* 
	 * Recursive functions make a call to themselves (recursive call)
	 * so they may solve a smaller version of the same problem 
	 */
	private static long factorial(int n) {
		if(n == 1)
			return 1;
		else
			return n * factorial(n-1);
		
		}

}

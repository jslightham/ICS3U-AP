package com.bayviewglen.daytwo;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean finished = false;
		int num;
		int sum = 0;
		/*
		while(!finished) {
			System.out.println("Enter a Number: ");
			num = in.nextInt();
			if(num%2==0) sum +=num;
			else finished = true;
		}
		*/
		for(;!finished;) {
			System.out.println("Enter a Number: ");
			num = in.nextInt();
			if(num%2==0) sum +=num;
			else finished = true;
		}
		System.out.println("The sum is: " + sum);
	}

}

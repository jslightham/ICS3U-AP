package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkSix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter Mass: ");
		int mass = in.nextInt();
		
		System.out.print("Please enter velocity in m/s: ");
		int speed = in.nextInt();
		
		System.out.println("The momentum is: " + mass*speed);
	}
}

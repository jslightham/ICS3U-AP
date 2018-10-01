package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkEleven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Mass: ");
		double mass = in.nextDouble();
		System.out.print("Enter Speed: ");
		double speed = in.nextDouble();
		double ke = 0.5 * mass * Math.pow(speed, 2);
		System.out.println("Kinetic Energy is: " + ke);
		
	}
	
}
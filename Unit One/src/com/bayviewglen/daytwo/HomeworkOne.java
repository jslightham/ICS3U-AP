package com.bayviewglen.daytwo;

public class HomeworkOne {
	public static void main(String[] args) {
		questionOne();
		System.out.println("\n");
		questionTwo();
		System.out.println("\n");
		questionThree();
		System.out.println("\n");
		questionFour();
		System.out.println("\n");
		questionFive();	
	}
	public static void questionOne() {
		int r = 5;
		double area = Math.pow(Math.PI * r, 2);
		
		System.out.println(area);
	}
	public static void questionTwo() {
		int r = 5;
		double volume = (4/3) * Math.PI * Math.pow(r, 3);
		
		System.out.println(volume);
	}
	public static void questionThree() {
		int a = 5;
		int b = 5;
		int c = 5;
		int x = 5;
		double y = a * Math.pow(x, 2) + b * x + c;
		System.out.println(y);
		
	}
	public static void questionFour() {
		int x1 = 5;
		int x2 = 5;
		int y1 = 5;
		int y2 = 5;
		double slope = (y2 - y1) / (x2 - x1);
		System.out.println(slope);
	}
	public static void questionFive() {
		int pennies = 5;
		int nickles = 5;
		int dimes = 5;
		int quarters = 5;
		int loonies = 5;
		int toonies = 5;
		int total = pennies + (nickles * 5) + (dimes * 10) + (quarters * 25) + (loonies * 100) + (toonies * 200);
		System.out.println(total);
		
	}
	
}

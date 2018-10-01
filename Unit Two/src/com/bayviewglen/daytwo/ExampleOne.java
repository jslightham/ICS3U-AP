package com.bayviewglen.daytwo;

public class ExampleOne {

	public static void main(String[] args) {
		int x = 321;
		
		System.out.println("This is the number: " + x);
		
		System.out.printf("This is the number: %d\n", x);
		
		int num1 = 10;
		int num2 = 19;
		int sum = num1 + num2;
		// test
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		System.out.printf("%d + %d = %d", num1, num2, sum);
		
		double a = 1.4456534;
		double b = 4.4536245;
		double c = a + b;
		
		System.out.println(a + " + " + b + " = " + c);
		System.out.printf("%+5.3f + %5.3f = %4.2f\n", a, b, c);
		
		double num = -4.5678;
		System.out.printf("%-+10.1f\n", num);
		
		int minutes = 11;
		double seconds = 34.2;
		
		System.out.printf("%3d:%6.3f\n", minutes, seconds);
		
		
		String name = "Philip";
		
		System.out.printf("Hello %s, how are you today?", name);

	}

}

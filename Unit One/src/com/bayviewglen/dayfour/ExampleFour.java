package com.bayviewglen.dayfour;
/*
 * Short Cut assignment operators
 */
public class ExampleFour {

	public static void main(String[] args) {
		int x = 7;
		int y = 10;
		/*.out.println(x++); // This does the System.out then the ++
		System.out.println(x);
		
		System.out.println(++y); // This does the ++ then the System.out
		System.out.println(y);
		*/
		int sum = ++x + y;
		
		System.out.println(x);		// 8
		System.out.println(y);		// 10
		System.out.println(sum);	// 18
		
		// -- subtracts 1
		
		// x++ is the same is x = x + 1
		// x = x + 3;
		
		x += 3;
		x -= 3;
		x *= 3;
		x /= 3;
		
		// We can also do x %= 3;
		
	}

}

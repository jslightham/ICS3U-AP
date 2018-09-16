package com.bayviewglen.daythree;

public class BayviewGlenPools {

	public static void main(String[] args) {
		int h2 = 8;
		int h1 = 4;
		int l = 20;
		int l3 = 5;
		int l2 = 8;
		int triangleHeight = h2 - h1;
		double triangleBase = Math.sqrt(Math.pow(l3, 2) - Math.pow(triangleHeight, 2));
		double triangleArea = (triangleBase * triangleHeight) / 2;
		double a5 = (h2 * triangleBase) - triangleArea;
		int w = 10;
		int areaWallOne = w * h2;
		int areaWallTwo = w * h1;
		double l1 = l - l2 - triangleBase;
		double a1 = l1 * w;
		int a2 = l2 * w;
		int a3 = l3 * w;
		int a4 = l2 * h1;
		double a6 = l1 * h2;
		// System.out.println(triangleBase);
		
		double totalArea = areaWallOne + areaWallTwo + a1 + a2 + a3 + (a4 * 2) + (a5 * 2) + (a6 * 2);
		
		System.out.println("The area of the pool is: " + totalArea + "M^2");
		
		double cost = totalArea * 25;
		System.out.println("The cost for the liner will be: $" + cost + "At $300/m^2");
		
		int v1 = h1 * l2 * w;
		double v2 = 5;
		double totalVolume = v1 + v2;
		System.out.println("Pool Volume: " + totalVolume);
		
		
	}

}

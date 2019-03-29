package com.bayviewglen.dayone;

public class BoxDriver {

	public static void main(String[] args) {
		Box2D b1 = new Box2D(5, 4);
		Box2D bB = new Box2D(5, 4);
		
		System.out.println("Equal?: " + b1.equals(bB));
		
		System.out.println("Length: " + b1.getLength());
		System.out.println("Width: " + b1.getWidth());
		System.out.println("Area: " + b1.getArea());
		System.out.println("Perimeter: " + b1.getPerimeter());
		System.out.println("Square?: " + b1.isSquare());
		
		Box3D b2 = new Box3D(5, 6, 7);
		System.out.println("Length: " + b2.getLength());
		System.out.println("Width: " + b2.getWidth());
		System.out.println("Height: " + b2.getHeight());
		System.out.println("Area: " + b2.getArea());
		// System.out.println("Perimeter: " + b2.getPerimeter()); // Will crash
		// System.out.println("Square?: " + b2.isSquare());	// Will Crash
		System.out.println("Cube?: " + b2.isCube());
		
		
		
	}
}

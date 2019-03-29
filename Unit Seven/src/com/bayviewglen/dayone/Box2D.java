package com.bayviewglen.dayone;

public class Box2D {
	private double length, width; 
	
	public double getArea() {
		return length * width;
	}
	public double getPerimeter() {
		return length*2 + width*2;
	}
	
	public Box2D(double length, double width) {
		this.length = length;
		this.width = width; 
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	
	public boolean equals(Box2D b) {
		return this.length == b.length && this.width == b.width;
	}
}

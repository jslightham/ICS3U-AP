package com.bayviewglen.dayone;

public class Box3D extends Box2D{

	private double height; 
	public Box3D(double length, double width, double height) {
		super(length, width);
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	@Override
	public double getArea() {
		return super.getArea()*2 + super.getPerimeter()*height;
	}
	
	public double getVolume() {
		return super.getArea()*height;
	}
	
	@Override
	public double getPerimeter() {
		throw new IllegalStateException("Box3D has no perimeter!");
	}
	
	@Override
	public boolean isSquare() {
		throw new IllegalStateException("Box3D should use isCube()!");
	}
	
	public boolean isCube() {
		return (getLength() == getWidth()) && getWidth() == height;
	}
	
	public boolean equals(Box3D b) {
		return getLength() == b.getLength() && getWidth() == b.getWidth() && b.height == this.height;
	}
	
}
 
package com.bayviewglen.assignment;

public class Test {

	public static void main(String[] args) {
		DoubleArraySequence d = new DoubleArraySequence(5);
		for(int i = 1; i<6; i++) {
			d.addAfter(i);
		}
		System.out.println();
		d.start();
		d.advance();
		d.removeCurrent();
	}

}

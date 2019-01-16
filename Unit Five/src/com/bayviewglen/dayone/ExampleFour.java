package com.bayviewglen.dayone;

import java.util.ArrayList;

public class ExampleFour {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		
		System.out.println("Size: " + words.size());
		
		words.add("Red");
		words.add("Green");
		words.add("Yellow");
		words.add(1, "Purple");
		
		System.out.println(words);
		System.out.println("Size: " + words.size());
		System.out.println();
		String oldColour = words.set(0, "Pink");
		System.out.println("Removed: " + oldColour);
		System.out.println(words);
		System.out.println("Size: " + words.size());
		System.out.println();
		oldColour = words.remove(1);
		System.out.println("Removed: " + oldColour);
		System.out.println(words);
		System.out.println("Size: " + words.size());	
	}
}
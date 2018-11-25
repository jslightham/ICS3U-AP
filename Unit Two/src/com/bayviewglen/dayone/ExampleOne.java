package com.bayviewglen.dayone;

public class ExampleOne {
	public static void main(String[] args) {
		int mark = 73;
		
		if(mark >= 80) {
			System.out.println("A");
		}else if(mark >= 70) {
			System.out.println("B");
		}else if(mark >= 60) {
			System.out.println("C");
		}else if(mark >= 50) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		// Syntax for an if statement
		/*
		 * 1. You can have only the if part
		 * if(boolean expression){
		 * 		//statements to execute if the boolean expression was true;
		 * } 
		 * 
		 * 2. You can have the if and only the else part
		 * if(boolean expression){
		 * 		//statements;
		 * }else{
		 * 		// statements for the else;
		 * }
		 * 
		 * 3. if ... else if ... else if ... else
		 * 
		 * 4. if ... else if ... else if
		 * 
		 */
	}
}

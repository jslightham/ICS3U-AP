package com.bayviewglen.daytwo;

import java.util.ArrayList;

public class APFR2017Q1 {
	
	public static ArrayList<Integer> digitList;
	public static void main(String[] args) {
		Digits2(678);
		System.out.println(digitList);
		
	}
	public void Digits (int num) {
		digitList = new ArrayList<Integer>();
		while(num / 10 > 0) {
			digitList.add(0, num % 10);
			num /= 10;
		}
		digitList.add(0, num);
		
	}
	
	public static void Digits2 (int num) {
		digitList = new ArrayList<Integer>();
		String s = "" + num;
		for(int i = 0; i<s.length(); i++) {
			digitList.add(s.charAt(i) - 48);
		}
	}
	
	public static boolean isStrictlyIncreasing() {
		for(int i = 1; i < digitList.size(); i++) {
			if(digitList.get(i - 1) > digitList.get(i))
				return false;
		}
		return true;
	}
}

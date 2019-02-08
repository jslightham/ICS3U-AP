package com.bayviewglen.daytwo;

import java.util.ArrayList;

public class APFR2018Q2 {

	public static ArrayList<WordPair> allPairs = new ArrayList<WordPair>();
	
	public void WordPairList(String[] words) {
		for(int i = 0; i< words.length -1; i++) {
			for(int j = i+1; j<words.length; i++) {
				allPairs.add(new WordPair(words[i], words[j]));
			}
		}
	}
	
	public int numMatches() {
		int count = 0;
		for(int i = 0; i<allPairs.size(); i++) {
			if(allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())) 
				count ++;
		}
		return count;
	}
}

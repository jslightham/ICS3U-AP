package com.bayviewglen.daythree;

public class APFR2013Q1 {
	public static void main(String[] args) {
		
		
	}
	
	public DownloadIfo getDownloadInfo(String title) {
		for(DownloadInfo a : downloadList) {
			if(a.getTitle().equals(title)) {
				return a;
			}
			return null;
		}
	}
	
	
}

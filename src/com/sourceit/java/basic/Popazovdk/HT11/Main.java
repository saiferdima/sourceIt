package com.sourceit.java.basic.Popazovdk.HT11;

public class Main {

	public static void main(String[] args) {
		
	MyTextStatistic mts = new MyTextStatistic(Info.someText);
	System.out.println(Info.someText);
	System.out.println(mts.getCharCount('l'));
	System.out.println(mts.getCharFrequency('l'));
	System.out.println(mts.getChars());
	System.out.println(mts.words());
	System.out.println(mts.getMostPopularCharCount());
	System.out.println(mts.getLeastPopularCharCount());
	System.out.println(mts.getCharByCount(9));
	

	
	}

}

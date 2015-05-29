package com.sourceit.java.basic.Popazovdk.HT11;



public class BuildStatistic {
	
	public String  buildStatistic(MyTextStatistic mts, char c) throws Exception{
		StringBuffer sb = new StringBuffer();
		
		sb.append("Statistic:");
		sb.append("\n");
		sb.append("The number of characters "+c+" : ");
		sb.append(mts.getCharCount(c));
		sb.append("\n");
		sb.append("The frequency of character  "+c+" : ");
		sb.append(mts.getCharFrequency(c)+"%");
		sb.append("\n");
		sb.append("The unique characters and it's counts: ");
		sb.append(mts.getChars());
		sb.append("\n");
		sb.append("Most popular char count: ");
		sb.append(mts.getMostPopularCharCount());
		sb.append("\n");
		sb.append("Least popular char count: ");
		sb.append(mts.getLeastPopularCharCount());
		sb.append("\n");
		sb.append("Source file text:");
		sb.append("\n");

		String result = sb.toString();
		return result;
	}

}

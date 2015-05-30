package com.sourceit.java.basic.Popazovdk.CW16;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	static String fileName = "C://Users/Shaff/git/sourceIt/src/com/sourceit/java/basic/Popazovdk/HT11/Countries.txt";
	static String sortedFileName = "C://Users/Shaff/git/sourceIt/src/com/sourceit/java/basic/Popazovdk/HT11/SortedCountries.txt";
	static ArrayList<String> arrayStringList = new ArrayList<String>();
	public static void main(String[] args) throws Exception {
		
		String notSortedText = ReadWrite.read(fileName);
		// System.out.println(notSortedText);
		MyTextStatistic mts = new MyTextStatistic(notSortedText);
		arrayStringList = (ArrayList<String>) mts.words();
		  
		for(String counter: arrayStringList){
				System.out.println(counter);
			}
		Collections.sort(arrayStringList);
		StringBuffer sb = new StringBuffer();
		for(String counter: arrayStringList){
			sb.append(counter);
			sb.append("\n");
		}
		ReadWrite.write(sortedFileName, sb.toString());


 
 
 

	}
	
	
	
}

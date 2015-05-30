package com.sourceit.java.basic.Popazovdk.CW16;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import java.util.Map.Entry;
import java.util.TreeMap;

import com.sourceit.java.basic.Lesson11.TextStatistics;

public class MyTextStatistic extends TextStatistics {
String myText = "";
ArrayList<Character> arrayCharList = new ArrayList<Character>();
ArrayList<String> arrayStringList = new ArrayList<String>();
Map<Character,Integer> treeMap = new TreeMap<Character,Integer>();

	public MyTextStatistic(String text) {
		super(text);
		myText=text;
		stringToCharList();
		treeMap = getChars();


	}
	public void stringToCharList(){
		for (char c : myText.toCharArray()) {
			arrayCharList.add(c);
			}
		
	}
	

	



	public int getCharFrequency(char c) {
		
		return getCharCount(c)*100/arrayCharList.size();
	}


	public int getCharCount(char c) {
		int counter = 0;
		for (int i =0;i<arrayCharList.size();i++){
			if(arrayCharList.get(i).equals(c)){
				counter=counter+1;
			}
			}

			
		
		return counter;
	}


	public Map<Character, Integer> getChars() {
		for (int i =0;i<arrayCharList.size();i++){
			treeMap.put(arrayCharList.get(i), 0);
			}
		for (int i =0;i<arrayCharList.size();i++){			
			treeMap.put(arrayCharList.get(i), treeMap.get(arrayCharList.get(i))+1);
		}
		
		
		return treeMap;
	}

	public List<String> words() {
	String	tempText = myText;
	String[] strings = tempText.replaceAll(" ", "").split("\\n");
	for(int i =0; i<strings.length;i++){
		;
		arrayStringList.add(strings[i]/*.replaceAll("\\W", "")*/);
		}
		return arrayStringList;
	}

	@Override
	public int getMostPopularCharCount() {
		int maxValue = 0;
		for(Entry<Character, Integer> entry: treeMap.entrySet()) {
			if(entry.getValue()>maxValue){
				maxValue=entry.getValue();
			}
		}
	return maxValue;
	}

	@Override
	public int getLeastPopularCharCount() {
		int minValue =arrayCharList.size();
		for(Entry<Character, Integer> entry: treeMap.entrySet()) {
			if(entry.getValue()<minValue){
				minValue=entry.getValue();
			}
		}
	return minValue;
	}


	@Override
	public char[] getCharByCount(int count) {
		char[] charArray = new char[treeMap.size()];
		int j =0;
		for(Entry<Character, Integer> entry: treeMap.entrySet()) {
			if(entry.getValue()==count){
				charArray[j]=entry.getKey();
				j=j+1;
			}

		
		
	}
		return charArray;
	}
	
	
}

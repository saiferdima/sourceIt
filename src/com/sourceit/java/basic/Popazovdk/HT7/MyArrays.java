package com.sourceit.java.basic.Popazovdk.HT7;

import com.sourceit.exercise.IntArrays;

public class MyArrays implements IntArrays {
	int [] array;
	
	public  MyArrays(){
		this(0);
	}
	
	public  MyArrays (int i){
		array = new int[i];
		
		
		
	}

	@Override
	public void add(int arg0) {
		int newLength = array.length+1;
		int[] temp = new int[newLength];
		for(int i =0;i<array.length;i++){
			temp[i]=array[i];
		}
		temp[newLength-1]=arg0;
		array = new int[newLength];
		for(int i =0;i<newLength;i++){
			array[i]=temp[i];
		}

		
		
	}

	@Override
	public int get(int arg0) {
		
		return array[arg0];
	}

	@Override
	public int size() {
		
		return array.length;
	}

}

package com.sourceit.java.basic.Popazovdk.HT6;

public    class Messanger {
	
	public static void showMessage(String message){
		System.out.println(message);
		
		
	}
	
	public static void showMessageFromSameLine(String message){
		System.out.print(message);
		
		
	}
	
	public static void showAllKidsName(Kid[] kids){
		for(int i =0;i<kids.length;i++){
			showMessage("Kid number = "+i+" Name: "+kids[i].getName());}
		
	}
	
	
	
	

}

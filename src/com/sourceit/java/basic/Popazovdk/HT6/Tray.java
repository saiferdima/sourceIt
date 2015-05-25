package com.sourceit.java.basic.Popazovdk.HT6;

public class Tray {
	
	
	public Icecream giveMeIcecream(){
	
	return  giveMeIcecream("in cup","milky");
	}

	public Icecream giveMeIcecream(String type,String taste){
		Icecream icecream = new Icecream(type,taste);
		return icecream;
		
	}
	

}

package com.sourceit.java.basic.Popazovdk.HT10;



public class Client {
	private String name;
	private int id;
	
public Client(String name){
	this.name=name;
	this.id=Main.getCurrentClientId();
	Main.increaceCurrentClientId();
	
}
	
	
	
	public String getName(){
		return name;
	
}
	
	public int getId(){
		return id;
	
}

}

package com.sourceit.java.basic.Popazovdk.HT6;

public class Kid {
private	String name ="Undefined";
private boolean sex = false;

public Kid(){
	setName("John Dou");
	
}

public Kid(String name){
	setName(name);
	
}

public void icecreamAction(Icecream icecream ){
	
	
	
	
}
public void setName(String newName){
	name=newName;
}	


public String getName(){
	return name;
}	

public void eatIcecream(Icecream icecream){
	Messanger.showMessage(this.name+" "+this.howToEat()+" "+icecream.gettaste()+" icecream "+icecream.getType());
	
	
}

private String howToEat(){
	String howToEat="bite";
	
	return howToEat;
}
	
}


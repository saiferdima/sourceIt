package com.sourceit.java.basic.Popazovdk.HT6;

public class Launcher {
	
	  public static void main(String[] args) {
		Messanger.showMessage("Hello");
		Kid kid = new Kid();
		Messanger.showMessage(kid.getName());
		Kid[] groupOne=KidsGroupBuilder.buildKidsGroup(10);
		Messanger.showAllKidsName(groupOne);
		Tray tray = new Tray();
		groupOne[0].eatIcecream(tray.giveMeIcecream("on a stick","chocolate"));
		groupOne[1].eatIcecream(tray.giveMeIcecream());
	  }

	  
	  
}

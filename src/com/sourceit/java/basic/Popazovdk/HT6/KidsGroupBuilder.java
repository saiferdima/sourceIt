package com.sourceit.java.basic.Popazovdk.HT6;

public class KidsGroupBuilder {
	
public static Kid[] buildKidsGroup(int count){
	Kid[] kid = new Kid[count];
	for (int i=0;i<kid.length;i++){
		kid[i] = new Kid("NewName"+i);
		
	}
	return kid;
	
}
	
	

}

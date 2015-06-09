package com.sourceit.java.basic.Popazovdk.Leasson19.Lab;

public class WGet {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		if(args.length==0){
			showInstruction();
		}
		String command = args[0];
		if("-i".equals(command)){
			
			//TODO ask for command
		}
		else if(!command.startsWith("http")){
			showInstruction();
			
		}
		System.out.println("Choose what to do next");
		System.out.println("1) Save address ");
		System.out.println("2) Display title ");
		System.out.println("3) Find a word ");
		System.out.println("4) List all URL's on the page ");

		
		sb.append(args.toString());

	}
	
	
	public static void showInstruction(){
		
		System.out.println("Usage: Some web address");
		System.out.println("     or -i");
		System.out.println("Example: http://google.com");
	}

}

package com.sourceit.java.basic.Popazovdk.Leasson19.Lab;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WGet {
static InputStream is = null;
static BufferedReader br;
public static String stringUrl = "No Url";

public static final String[] COMMANDS = {"Save page", "Display title", "Find a word", "List all URL's on the page", "Exit programm"};
public static final String FILE_NAME= "C://Users/Shaff/git/sourceIt/src/com/sourceit/java/basic/Popazovdk/Leasson19/WebPage.html";	
	public static void main(String[] args) throws MalformedURLException {

		if(args.length == 0){
			System.out.println(getInstructions());
			return;
		}
		
		String command = args[0];

		if("-i".equals(command)){
			//TODO ask for URL
			System.out.println("Enter an URL:");
		} else if(!command.startsWith("http")){
			System.out.println(getInstructions());
			return;
		}
		
		//TODO list of options
		stringUrl =args[0];
		System.out.println("Select what to do next:");
		
		for(int i = 0; i < COMMANDS.length; i++){
			System.out.println((i+1) + ") " + COMMANDS[i]);
		}
		
		int choise = -1;
		//TODO ask for input
		 Scanner in = new Scanner(System.in);
		try{
			 choise = in.nextInt();
		}
		catch (InputMismatchException e){
            System.out.print("Incorrect value.");
            return;
			
		}
       
		executeCommand(choise);
	}
	
	private static void executeCommand(int commandNumber){
		switch (commandNumber) {
		case 1:
			System.out.println("Page will be saved to file: \n"+FILE_NAME);
			savePageToFile(stringUrl,FILE_NAME);
			break;

		case 2:
			//TODO
			break;
		case 3:
			//TODO
			break;
		case 4:
			//TODO
			break;
		default:
			
			break;
		}
	}
	
	public static void savePageToFile(String StringUrl, String fileName){
		String line;
		StringBuffer sb = new StringBuffer();
		try {
			URL url = new URL(StringUrl);
			 is = url.openStream();
			 br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			    while (( line = br.readLine()) != null) {
		            sb.append(line);
		        }
		} catch (Exception e) {
			System.out.println("URL is not valid");
			return;
		}
		FileEditor.write(fileName,sb.toString());

	}
	
	public static String getInstructions(){
		return "Usage: some web address\n" + 
				"      or -i\n" +
				"Example: http://google.com";
	}

}

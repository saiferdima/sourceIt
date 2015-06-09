package com.sourceit.java.basic.Popazovdk.Leasson19.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class MyUrl {
	
public	MyUrl(){
		
	}
	
public	MyUrl(String url){
	 URL myUrl;
	    InputStream is = null;
	    BufferedReader br;
	    String line;

	    try {
	    	myUrl = new URL(url);
	        is = myUrl.openStream();
	        br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
	    }catch(Exception ex){
	    	System.out.println("Smth. wrong" + ex);
	    } finally {
	    	if (is != null){
	    		try {
					is.close();
				} catch (IOException e) {}
	    	}
	    }
}

	
	
}



package com.sourceit.java.basic.Popazovdk.Leasson19.Lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileEditor {
	
	
	public static void write(String fileName, String text) {

    File file = new File(fileName);
 
    try {

        if(!file.exists()){
            file.createNewFile();
        }
 
        OutputStreamWriter  out = new OutputStreamWriter(new FileOutputStream(file.getAbsoluteFile()), "UTF-8");
     //   PrintWriter out = new PrintWriter(file.getAbsoluteFile());
 
        try {
        	out.write(text);
            //out.print(text);
        } finally {
            out.close();
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }
}

public static String read(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    StringBuilder sb = new StringBuilder();
 
    exists(fileName);
 
    try {
        BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
        try {
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        } finally {
            in.close();
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }
 

    return sb.toString();
}

private static void exists(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    if (!file.exists()){
        throw new FileNotFoundException(file.getName());
    }
}



}

package com.sourceit.java.basic.Popazovdk.Leasson19.Lab;

import java.io.*;

public class FileEditor {


    public static void write(String fileName, String text) {

        File file = new File(fileName);

        try {

            if (!file.exists()) {
                file.createNewFile();
            }

            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(file.getAbsoluteFile()), "UTF-8");


            try {
                out.write(text);

            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }


}

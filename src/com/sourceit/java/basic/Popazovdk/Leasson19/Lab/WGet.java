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

    public static final String[] COMMANDS = {"Save page", "Display title", "Find a word", "List all URL's on the page (Beta)", "Exit programm"};
    public static final String FILE_NAME = "D://DL/WebPage.html";

    public static void main(String[] args) throws MalformedURLException {

        if (args.length == 0) {
            System.out.println(getInstructions());
            return;
        }

        String command = args[0];

        if ("-i".equals(command)) {

            System.out.println("Enter an URL:");
            Scanner in = new Scanner(System.in);
            try {
                command = in.nextLine();


            } catch (InputMismatchException e) {
                System.out.print("Incorrect value.");
                return;
            }
            if (!command.startsWith("http")) {
                System.out.println("Entered url is not valid");
                return;
            }
            args[0] = command;

        } else if (!command.startsWith("http")) {
            System.out.println(getInstructions());
            return;
        }

        //TODO list of options
        stringUrl = args[0];
        System.out.println("Select what to do next:");

        for (int i = 0; i < COMMANDS.length; i++) {
            System.out.println((i + 1) + ") " + COMMANDS[i]);
        }

        int choise = -1;
        //TODO ask for input
        Scanner in = new Scanner(System.in);
        try {
            choise = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Incorrect value.");
            return;

        }

        executeCommand(choise);
    }

    private static void executeCommand(int commandNumber) {
        switch (commandNumber) {
            case 1:
                System.out.println("Page will be saved to file: \n" + FILE_NAME);
                savePageToFile(stringUrl, FILE_NAME);
                break;

            case 2:
                System.out.print(getTitle(getHTMLFromURL(stringUrl)));
                break;
            case 3:
                System.out.print("Type some word to find");
                Scanner in = new Scanner(System.in);
                try {
                    String word = in.nextLine();
                    System.out.print(findWordInText(getHTMLFromURL(stringUrl), word));
                } catch (InputMismatchException e) {
                    System.out.print("Incorrect value.");
                    return;
                }


                break;
            case 4:
                System.out.print(getAllLinksFromText(getHTMLFromURL(stringUrl)));
                ;


                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Incorrect value, Exit");
                break;
        }
    }

    private static String getAllLinksFromText(String html) {
        String line = "";
        String searchFrom = "\"http";
        String searchTo = "\"";
        if (!html.contains(searchFrom)) {
            return "Can't find any URLs";
        }
        StringBuilder sb = new StringBuilder();
        System.out.println("List of URLs:");
        while (html.contains(searchFrom)) {
            Integer startIndex = html.indexOf(searchFrom) + 1;
            Integer stopIndex = html.indexOf(searchTo, startIndex + 1);

            line = html.substring(startIndex, stopIndex);
            sb.append(line);
            sb.append("\n");
            html = html.substring(stopIndex);
        }


        return sb.toString();
    }

    private static String findWordInText(String html, String word) {
        if (html.contains(word)) {
            Integer startIndex = 10;
            Integer stopIndex = 10;
            if (html.indexOf(word) < 10) {
                startIndex = html.indexOf(word);
            }
            if (((html.indexOf(word) + 10) > html.length())) {
                stopIndex = (html.length() - html.indexOf(word));
            }
            html = html.substring((html.indexOf(word)) - startIndex, (html.indexOf(word)) + stopIndex);
        } else {
            return "The word \"" + word + "\" not exist";
        }
        return html;
    }

    private static String getTitle(String html) {
        try {
            html = html.substring((html.indexOf("<title>")) + 7, html.indexOf("</title>"));
        } catch (StringIndexOutOfBoundsException e) {
            return ("Cannot parse title from page.");

        }
        System.out.println("Title is : ");
        return html;
    }

    public static void savePageToFile(String stringUrl, String fileName) {
        FileEditor.write(fileName, getHTMLFromURL(stringUrl));
    }

    public static String getHTMLFromURL(String stringUrl) {
        String line;
        StringBuffer sb = new StringBuffer();
        try {
            URL url = new URL(stringUrl);
            is = url.openStream();
            br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
        } catch (Exception e) {
            return "URL is not valid";
        }
        return sb.toString();


    }

    public static String getInstructions() {
        return "Usage: some web address\n" +
                "      or -i\n" +
                "Example: http://google.com";
    }

}

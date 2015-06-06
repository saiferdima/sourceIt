package com.sourceit.java.basic.Popazovdk;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Shaff
 * Date: 06.06.15
 * Time: 0:12
 * To change this template use File | Settings | File Templates.
 */
public class MainLauncher {
    public static int taskNumber = 1;
    public static String[] parameters = new String[1];

    public static void main(String[] args) throws Exception {
        showInstruction();
        Scanner in = new Scanner(System.in);
        try {
            taskNumber = in.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.print("Incorrect value. Try again \n ");
            main(parameters);
        }

        makeDecision(taskNumber);


    }

    public static void showInstruction() {
        System.out.println("List of home tasks:  \n");
        System.out.println("1 - Home task 3  (Maze) ");
        System.out.println("2 - Home task 6  (IceCream) ");
        System.out.println("3 - Home task 7  (Arrays) ");
        System.out.println("4 - Home task 8  (Employee) ");
        System.out.println("5 - Home task 10 (Bank) ");
        System.out.println("6 - Home task 11 (Text Statistic) ");
        System.out.println("0 - Exit \n");
        System.out.println("Enter appropriate number to run program \n");
    }

    public static void makeDecision(int number) throws Exception {
        if (number >= 0 && number < 7) {
            switch (number) {
                case 0:
                    System.out.println("Exit");
                    break;
                case 1: {
                    System.out.println("Run - Home task 3  (Maze): ");
                    com.sourceit.java.basic.Popazovdk.HT3.Game.main(parameters);
                }
                break;
                case 2:
                    System.out.println("Run - Home task 6  (IceCream) ");
                    com.sourceit.java.basic.Popazovdk.HT6.Launcher.main(parameters);
                    break;
                case 3:
                    System.out.println("3 - Home task 7  (Arrays) ");
                    com.sourceit.java.basic.Popazovdk.HT7.Launcher.main(parameters);
                    break;

                case 4:
                    System.out.println("4 - Home task 8  (Employee) ");
                    com.sourceit.java.basic.Popazovdk.HT8.Launcher.main(parameters);
                    break;
                case 5:
                    System.out.println("5 - Home task 10 (Bank) ");
                    com.sourceit.java.basic.Popazovdk.HT10.Main.main(parameters);
                    break;
                case 6:
                    System.out.println("6 - Home task 11 (Text Statistic) ");
                    com.sourceit.java.basic.Popazovdk.HT11.Main.main(parameters);
                    break;
            }
        } else {
            System.out.println("Entered number is not valid. Try again ");
            main(parameters);
        }
    }


}

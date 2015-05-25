package com.sourceit.java.basic.Popazovdk.HT8;

/**
 * Created with IntelliJ IDEA.
 * User: Shaff
 * Date: 25.04.15
 * Time: 2:43
 * To change this template use File | Settings | File Templates.
 */
public class Messager {

    public static void printEmployeesData(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getId());
            System.out.println(employee[i].getName());
            System.out.println(employee[i].getSalary());
        }

    }
}

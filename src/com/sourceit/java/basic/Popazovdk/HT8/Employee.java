package com.sourceit.java.basic.Popazovdk.HT8;


public abstract class Employee implements Comparable<Employee> {
    private int id;
    private String name = "NoName";
    private float salary = 0;
    private int type;


    public Employee() {
        this("DefaultName");
    }

    public Employee(String name) {
        id = Settings.getCurrentEmployeeId();
        Settings.increaseCurrentEmployeeId();
        this.name = name;

    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public int compareTo(Employee o) {
        return 0;
    }

    public abstract float calculateSalary();
}

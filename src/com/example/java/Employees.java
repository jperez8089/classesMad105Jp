package com.example.java;

public class Employees {
    private String employeeID;  //Name of the employee. Private because we want it to stay within class
    private String employeeNum;  //number of employee
    private int employeeShift;   //employee shift as 1,2 or 3

    // These are the constructors

    public Employees(String employeeID, String employeeNum, int employeeShift) {
        this.employeeID = employeeID;
        this.employeeNum = employeeNum;
        this.employeeShift = employeeShift;
    }
    //Getters and Setters
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public int getEmployeeShift() {
        return employeeShift;
    }

    public void setEmployeeShift(int employeeShift) {
        this.employeeShift = employeeShift;
    }
    //This is where we are printing everything so it is formatted in a neat fashion
    public void printAll(){
        System.out.println("Employee Name: " + employeeID  + "\n" + "Employee Number: " + employeeNum  + "\n" +
                "Employee Shift: " + employeeShift);
    }
}

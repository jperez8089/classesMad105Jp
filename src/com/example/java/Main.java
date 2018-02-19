package com.example.java;

public class Main {

    public static void main(String[] args) {

        Employees emp1 = new Employees("Javier Perez","No.14234",1);
        Employees emp2 = new Employees("John Smith", "No.23123",2);
        Employees emp3 = new Employees("Jon Smiths", "No.24235",3);

        //Printing
        emp1.printAll();//This will print out employee 1
        System.out.println("\n"); //This will be a new line
        emp2.printAll(); // this will print employee 2
        System.out.println("\n"); // new line
        emp3.printAll(); // will print employee 3.


    }
}

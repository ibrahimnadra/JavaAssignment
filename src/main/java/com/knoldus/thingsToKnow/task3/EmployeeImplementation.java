//Consider a class called "Employee" with a static variable called "nextId".
// How would you use this variable to assign a unique ID to each new employee object created?
package com.knoldus.thingsToKnow.task3;

import java.util.Scanner;

class Employee {
    private static int nextId;
    private int id;
    private String name;
    Employee(String name){
        id = nextId;
        this.name = name;
        nextId++;
    }
    public static void setNextId(int newNextId){
        nextId = newNextId;
    }
    public void printDetails(){
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
    }

}

public class EmployeeImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean endLoop = false;
        String name;

        System.out.println("Enter the next Id to start with :");
        int nextId = scanner.nextInt();
        Employee.setNextId(nextId);
        System.out.println("Enter the first Employee name : ");
        name = scanner.next();
        Employee firstEmployee = new Employee(name);
        System.out.println("Enter the second Employee name : ");
        name = scanner.next();
        Employee secondEmployee = new Employee(name);
        System.out.println("Enter the third Employee name : ");
        name = scanner.next();
        Employee thirdEmployee = new Employee(name);

        System.out.println("Employee Details : ");
        firstEmployee.printDetails();
        secondEmployee.printDetails();
        thirdEmployee.printDetails();
    }
}

//You are building a data analysis tool that analyzes the performance of a company's sales
// team. The tool needs to calculate the total sales made by each salesperson in a given period
// (e.g. month, quarter, year).
// How would you use Java aggregations to calculate the total sales made by each salesperson?
package com.knoldus.task5;

import java.util.Scanner;

class Sales{
    private double salesPerDay;
    //Number of days he made sale
    private double saleDuration;

    public void setSaleDuration(double saleDuration) {
        this.saleDuration = saleDuration;
    }

    public void setSalesPerDay(double salesPerDay) {
        this.salesPerDay = salesPerDay;
    }

    public double getSaleDuration() {
        return saleDuration;
    }

    public double getSalesPerDay() {
        return salesPerDay;
    }
}
class SalesPerson{
    private String name;
    private Sales sales = new Sales();
    SalesPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name : ");
        name = scanner.next();
        System.out.println("Number of days of sale : ");
        sales.setSaleDuration(scanner.nextDouble());
        System.out.println("Sales per day : ");
        sales.setSalesPerDay(scanner.nextDouble());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sales getSales() {
        return sales;
    }

    public double getTotalSales(){
        return (sales.getSaleDuration() * sales.getSalesPerDay());
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }
}



public class SalesTeamPerformanceImplementation {
    public static void main(String[] args) {
        SalesPerson salesPerson = new SalesPerson();
        System.out.println("Total Sales made by " +  salesPerson.getName() + " are " + salesPerson.getTotalSales());
    }

}

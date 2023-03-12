package com.knoldus.task2;

class Printer {
    // this method  accepts integer
    public void print(int number){
        System.out.println("Integer value : " +  number);
    }

    // this method  accepts String object
    public void print(String string){
        System.out.println("String value : " +  string);
    }
}

public class PrinterImplementation {
    public static void main(String[] args) {
        Printer printer = new Printer() ;
        printer.print(1);
        printer.print("Hello");
    }
}

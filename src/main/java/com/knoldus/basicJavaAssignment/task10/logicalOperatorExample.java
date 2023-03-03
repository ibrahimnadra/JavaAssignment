//Create a program that declares two boolean variables named "isCold" and "isRainy" and initializes
// them with the values true and false respectively. Using logical operators,
//print "Bring a jacket and an umbrella" if both variables are true,
// "Bring a jacket" if only isCold is true, and "Bring an umbrella" if only isRainy is true.
package com.knoldus.basicJavaAssignment.task10;

public class logicalOperatorExample {
    public static void main(String[] args) {
        Boolean isCold = true, isRainy = false;
        if(isCold && isRainy){
            System.out.println("Bring a jacket and an umbrella");
        }
        else if(isCold){
            System.out.println("Bring a jacket");
        }
        else if(isRainy){
            System.out.println("Bring an umbrella");
        }

    }
}

//Create a Java class with a public method.
// Define a method in the same package that tries to access the public method. What happens?
package com.knoldus.thingsToKnow.task14;

class BaseClassWithPublicMethod{
    public void printPublicMethodOfBaseClass(){
        System.out.println("I am in the public method of the base class.");
    }
}

class DerivedClass extends BaseClassWithPublicMethod {
    public void callParentMethod(){
        printPublicMethodOfBaseClass();
        System.out.println("I am in the derived class.");
    }
}

public class PublicMethodExample {
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.callParentMethod();
    }
}

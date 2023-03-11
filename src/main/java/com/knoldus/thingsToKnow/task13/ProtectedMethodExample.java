//Create a Java class with a protected method.
// Define a subclass of the class and try to call the protected method from the subclass. What happens?
package com.knoldus.thingsToKnow.task13;

class BaseClassWithProtectedMethod{
    protected void printProtectedMethodOfBaseClass(){

        System.out.println("I am in the protected method of the base class.");
    }
}

class DerivedClass extends BaseClassWithProtectedMethod {
    public void callParentMethod(){
        printProtectedMethodOfBaseClass();
        System.out.println("I am in the derived class.");
    }
}

public class ProtectedMethodExample {
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.callParentMethod();
    }
}

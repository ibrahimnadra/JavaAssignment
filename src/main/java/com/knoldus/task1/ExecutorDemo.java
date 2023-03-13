//Create a class called Task with a method run that takes a single integer parameter
// and prints the value of that parameter to the console.
//Create a class called ExecutorDemo with a method main that creates an Executor object
// and uses it to execute 10 instances of the Task class, passing a different integer
// value to each instance.
//Use the submit method of the Executor object to submit the Task instances to the executor.
// The submit method returns a Future object, so use the get method of the Future class
// to retrieve the result of each task.
//Print the results of the tasks to the console.
package com.knoldus.task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task extends Thread{
    int parameter;
    Task(int parameter){
        this.parameter = parameter;
    }
    public void run(){
        System.out.println(parameter);
    }
}
public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            Task task = new Task(i);
            Future<?> future = executor.submit(task);
            try{
                String f = (String)future.get();
                System.out.println(f);
            }catch(Exception e){
                System.out.println(e);
            }
        }

    }
}

//Suppose you have a class called "Database" with a static variable called "numOfConnections".
// How would you use this variable to keep track of the number of active database connections?
package com.knoldus.thingsToKnow.task7;


class Database {
    private static int numOfConnections = 0;

    // Method to establish a new database connection
    public static void connect() {
        // Code to establish a new connection
        numOfConnections++;
        System.out.println("Number of active connections: " + numOfConnections);
    }

    // Method to close a database connection
    public static void closeConnection() {
        // Code to close the connection
        numOfConnections--;
        System.out.println("Number of active connections: " + numOfConnections);
    }

}
public class DatabaseImplementation {
    public static void main(String[] args) {
        Database database = new Database();
        database.connect();
        database.closeConnection();
    }
}

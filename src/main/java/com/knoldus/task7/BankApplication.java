//You are building a banking application in Java. The application needs to store the
// account balance for each customer. How would you use encapsulation to ensure that
// the account balance can only be accessed and modified by authorized code?
package com.knoldus.task7;
import java.util.Scanner;
class BankDetails {
    private static final String authorizedCode = "MNC1001";
    private String name;
    private String accountNumber;
    private String accountType;
    private long balance;
    Scanner scanner = new Scanner(System.in);
    private void openAccount() {
        System.out.print("Enter Account No: ");
        accountNumber = scanner.next();
        System.out.print("Enter Account type: ");
        accountType = scanner.next();
        System.out.print("Enter Name: ");
        name = scanner.next();
        System.out.print("Enter Balance: ");
        balance = scanner.nextLong();
    }
    //method to display account details
    private void viewDetails() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accountNumber);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance: " + balance);
    }
    //method to deposit money
    private void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = scanner.nextLong();
        balance = balance + amt;
    }
    //method to withdraw money
    private void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = scanner.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }

    public void authorization(String authorizedCode){
        if(this.authorizedCode.equals(authorizedCode)){
            int choice = 0;
            while(choice != 5){
                System.out.println("1. View Account Details.");
                System.out.println("2. Deposit Amount.");
                System.out.println("3. Withdraw Amount.");
                System.out.println("4. Open Account.");
                System.out.println("5. Exit.");
                choice = scanner.nextInt();
                switch(choice){
                    case 1 :
                        viewDetails();
                        break;
                    case 2 :
                        deposit();
                        break;
                    case 3 :
                        withdrawal();
                        break;
                    case 4 :
                        openAccount();
                        break;
                    case 5 :
                        break;
                    default:
                        System.out.println("Wrong choice.");
                }
            }
        }
        else{
            System.out.println("Invalid authorization.");
        }

    }
}

public class BankApplication {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        BankDetails bankDetails = new BankDetails();
        System.out.println("Enter authorization code : ");
        bankDetails.authorization(scanner.next());
    }
}
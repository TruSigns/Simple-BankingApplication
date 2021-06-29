package cademy.training;

import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {
        bankAccount obj = new bankAccount("Maurice Ruffin", "00353232");
        obj.showMenu();
    }
}

class bankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;


    public bankAccount(String cName, String cID){
        customerName = cName;
        customerID = cID;
    }

    void deposit(int amount) {
        if(amount != 0 ){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if(amount != 0) {

            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if(previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        }else if(previousTransaction < 0){
            System.out.println("Withdraw: " + Math.abs(previousTransaction));
        }else{
            System.out.println("Invalid transaction");
        }

    }

    void showMenu () {
        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome " + customerName );
        System.out.println("Your ID " + customerID);
        System.out.println("\n");


        System.out.println("A : Check Your Balance");
        System.out.println("B : Deposit");
        System.out.println("C : Withdraw");
        System.out.println("D : Previous Transaction");
        System.out.println("E : Exit The System");

        do {
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
            System.out.println("Enter Your Option");
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch (option) {

                case 'A':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Balance = "+balance);
                    System.out.println("-------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Enter an amount to deposit ");
                    System.out.println("-------------------------------------------------------");

                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Enter an amount to withdraw ");
                    System.out.println("-------------------------------------------------------");

                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("-------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("-------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E' :
                    System.out.println("=========================================================================================================");
                    break;

                default:
                    System.out.println("Invalid Option!! Please Enter Correct Opton...");
                    break;
            }
        }
        while(option != 'E');
        System.out.println("Thank You for Using our Services.....!!");
    }
}



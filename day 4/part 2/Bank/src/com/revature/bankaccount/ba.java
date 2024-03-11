package com.revature.bankaccount;

import java.util.Scanner;

public class ba{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of depositors: ");
        int numD = scanner.nextInt();
        BankAccount[] ba = new BankAccount[numD];
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < numD; i++) {
            System.out.println("Enter information for depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Type of Account: ");
            String type = scanner.nextLine();
            System.out.print("Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            ba[i] = new BankAccount(name, address, type, balance);
        }
        System.out.println("Information of depositor 2:");
        ba[1].display();
        ba[0].deposit(1000);
        ba[0].display();
        ba[2].withdraw(500);
        ba[2].display();
        ba[0].changeAddress("New Address");
        ba[0].display();
        int totalTransactions = 0;
        for (BankAccount i : ba) {
            totalTransactions += i.getTransactions();
        }
        System.out.println("Total transactions: " + totalTransactions);

        scanner.close();
    }
}

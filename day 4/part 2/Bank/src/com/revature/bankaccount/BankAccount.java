package com.revature.bankaccount;

public class BankAccount {
    private String name;
    private String address;
    private String type;
    private double balance;
    private static int accountCounter = 1000;
    private int accountNumber;
    private int transactions;

    public BankAccount(String name, String address, String type, double balance) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.balance = balance;
        this.accountNumber = accountCounter++;
        this.transactions = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void display() {
        System.out.println("Account Number : BA" + accountNumber);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Type of Account : " + type);
        System.out.println("Balance : " + balance);
        System.out.println("Number of Transactions : " + transactions);
    }

    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions++;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void changeAddress(String newAddress) {
        address = newAddress;
    }

    public int getTransactions() {
        return transactions;
    }
}
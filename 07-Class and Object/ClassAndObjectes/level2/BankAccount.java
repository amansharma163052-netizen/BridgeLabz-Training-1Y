package com.gla.ClassAndObjectes.level2;

public class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    void withdraw(double amount){

        if(balance >= amount){
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance(){
        System.out.println("Current Balance: " + balance);
    }
}

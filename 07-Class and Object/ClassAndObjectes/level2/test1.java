package com.gla.ClassAndObjectes.level2;
public class test1{
public static void main(String[] args) {

    BankAccount acc1 = new BankAccount();

    acc1.accountHolder = "Ak";
    acc1.accountNumber = 101;
    acc1.balance = 5000;

    acc1.deposit(2000);
    acc1.withdraw(3000);
    acc1.displayBalance();
}
}
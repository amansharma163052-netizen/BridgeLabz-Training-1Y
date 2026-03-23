package com.gla.AccessModifiers;

class BankAccount {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }

    public static void main(String[] args) {

        SavingsAccount acc = new SavingsAccount();

        acc.accountNumber = 12345;
        acc.accountHolder = "Ravi";
        acc.setBalance(5000);

        acc.displayAccount();
    }
}

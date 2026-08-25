package com.bank.model;

public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, String owner) {
        super(accountNumber, balance, owner);
        this.overdraftLimit = 0; // Set a default overdraft limit
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Penarikan gagal. Melebihi batas overdraft.");
        }
    }
}

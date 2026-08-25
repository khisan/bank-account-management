package com.bank.model;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String owner, double interestRate) {
        super(accountNumber, balance, owner);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Bunga sebesar " + interest + " telah diterapkan. Saldo saat ini: " + getBalance());
    }
}

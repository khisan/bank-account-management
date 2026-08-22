package com.bank.model;
public class Account {
    private String accountNumber;
    private double balance;
    private String owner;

    public Account(String accountNumber, double balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
      return owner;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit berhasil. Saldo saat ini: " + balance);
        } else {
            System.out.println("Jumlah deposit harus lebih besar dari 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Penarikan berhasil. Saldo saat ini: " + balance);
        } else if (amount > balance) {
            throw new IllegalStateException("Saldo tidak mencukupi.");
        } else {
            System.out.println("Jumlah penarikan harus lebih besar dari 0.");
        }
    }
}
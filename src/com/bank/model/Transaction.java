package com.bank.model;
public class Transaction {
    private String transactionId;
    private String accountNumber;
    private double amount;
    private String transactionType; // "deposit" or "withdrawal"
    private String date;

    public Transaction(String transactionId, String accountNumber, double amount, String transactionType, String date) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionType = transactionType;
        this.date = date;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getDate() {
      return date;
    }
    
    public void setDate(String date) {
      this.date = date;
    }

    public void setTransactionId(String transactionId) {
      this.transactionId = transactionId;
    }
    
    public void setAccountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
    }

    public void setAmount(double amount) {
      this.amount = amount;
    }

    public void setTransactionType(String transactionType) {
      this.transactionType = transactionType;
    }
}
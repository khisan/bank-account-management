package com.bank.model;
public class Transaction {
    private String transactionId;
    private String source;
    private String destination;
    private double amount;
    private String transactionType; // "deposit" or "withdrawal"
    private String date;

    public Transaction(String transactionId, String source, String destination, double amount, String transactionType, String date) {
        this.transactionId = transactionId;
        this.source = source;
        this.destination = destination;
        this.amount = amount;
        this.transactionType = transactionType;
        this.date = date;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getSource() {
      return source;
    }
    
    public String getDestination() {
      return destination;
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
    
    public void setDestination(String destination) {
      this.destination = destination;
    }

    public void setSource(String source) {
      this.source = source;
    }

    public void setAmount(double amount) {
      this.amount = amount;
    }

    public void setTransactionType(String transactionType) {
      this.transactionType = transactionType;
    }
}
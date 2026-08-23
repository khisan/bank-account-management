package com.bank.model;

public class Transaction {

    private String transactionId;
    private String source;
    private String destination;
    private double amount;
    private String transactionType; // "deposit" or "withdrawal"
    private String date;

    public Transaction(
        String transactionId,
        String source,
        String destination,
        double amount,
        String transactionType,
        String date
    ) {
        this.transactionId = transactionId;
        this.source = source;
        this.destination = destination;
        this.amount = amount;
        this.transactionType = transactionType;
        this.date = date;
    }

    public void setTransactionHistory(Transaction transaction) {
        System.out.println(
            "Transaction recorded: " +
                transaction.getTransactionId() +
                ", Source: " +
                transaction.getSource() +
                ", Destination: " +
                transaction.getDestination() +
                ", Amount: " +
                transaction.getAmount() +
                ", Type: " +
                transaction.getTransactionType() +
                ", Date: " +
                transaction.getDate()
        );
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
}

package com.bank.service;

import com.bank.model.*;

public class BankService {

    public void transfer(Account source, Account destination, double amount) {
        if (source.getBalance() >= amount) {
            source.withdraw(amount);
            destination.deposit(amount);
            System.out.println("Transfer berhasil. Saldo saat ini: " + source.getBalance());
            String transactionId = "TXN" + System.currentTimeMillis();
            Transaction transaction = new Transaction(
                transactionId,
                source.getAccountNumber(),
                destination.getAccountNumber(),
                amount,
                "transfer",
                new java.util.Date().toString()
            );
            transaction.setTransactionHistory(transaction);
        } else {
            System.out.println("Transfer gagal. Saldo tidak mencukupi.");
        }
    }

    public void gettransactionHistory(Transaction transaction) {
        transaction.gettransactionHistory(transaction);
    }
}

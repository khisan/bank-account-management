package com.bank.service;

import com.bank.model.*;
import java.util.ArrayList;
import java.util.List;

public class BankService {

    private List<Account> accounts = new ArrayList<>();

    public void transfer(Account source, Account destination, double amount) {
        try {
            source.withdraw(amount);
            destination.deposit(amount);
            String transactionId = "TXN" + System.currentTimeMillis();
            Transaction transaction = new Transaction(
                transactionId,
                source.getAccountNumber(),
                destination.getAccountNumber(),
                amount,
                "transfer",
                java.time.LocalDateTime.now().toString()
            );
            transaction.setTransactionHistory(transaction);
            System.out.println(
                "Transfer berhasil dari " +
                    source.getAccountNumber() +
                    " ke " +
                    destination.getAccountNumber() +
                    " sebesar " +
                    amount
            );
            System.out.println("Saldo sumber: " + source.getBalance() + ", Saldo tujuan: " + destination.getBalance());
        } catch (IllegalStateException e) {
            System.out.println("Transfer gagal: " + e.getMessage());
        }
    }

    public void getTransactionHistory(Transaction transaction) {
        transaction.getTransactionHistory(transaction);
    }

    public Customer createCustomer(
        String id,
        String name,
        String email,
        String address,
        String phoneNumber,
        List<Account> accounts
    ) {
        Customer customer = new Customer(id, name, email, address, phoneNumber, accounts);
        System.out.println(
            "Customer created: " + customer.getName() + ", " + customer.getAddress() + ", " + customer.getPhoneNumber()
        );
        return customer;
    }

    public Account createAccount(
        Enum<AccountType.Type> accountType,
        double balance,
        String owner,
        double interestRate
    ) {
        Account account;
        if (accountType == AccountType.Type.CHECKING) {
            String accountNumber = "CHK" + System.currentTimeMillis();
            account = new CheckingAccount(accountNumber, balance, owner);
            System.out.println("Checking account created: " + accountNumber + ", Owner: " + owner);
        } else if (accountType == AccountType.Type.SAVINGS) {
            String accountNumber = "SAV" + System.currentTimeMillis();
            account = new SavingsAccount(accountNumber, balance, owner, interestRate);
            System.out.println(
                "Savings account created: " + accountNumber + ", Owner: " + owner + ", Interest Rate: " + interestRate
            );
        } else {
            throw new IllegalArgumentException("Invalid account type: " + accountType);
        }
        accounts.add(account);
        System.out.println("Akun berhasil dibuat: " + account.getAccountNumber() + ", Pemilik: " + account.getOwner());
        return account;
    }

    public List<Account> getAllAccounts() {
        for (Account account : accounts) {
            System.out.println(
                "Nomor Akun: " +
                    account.getAccountNumber() +
                    ", Saldo: " +
                    account.getBalance() +
                    ", Pemilik: " +
                    account.getOwner()
            );
        }
        return accounts;
    }

    public Account getAccountByAccountNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}

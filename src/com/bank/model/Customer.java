package com.bank.model;

import java.util.List;

public class Customer {

    private String id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private List<Account> accounts;

    public Customer(String id, String name, String email, String address, String phoneNumber, List<Account> accounts) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.accounts = accounts;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

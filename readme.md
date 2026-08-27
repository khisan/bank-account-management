````markdown
# 🏦 Bank Account Management System (Java CLI)

A simple, object-oriented Java command-line application for managing bank accounts, customers, and financial transactions. This project demonstrates core Object-Oriented Programming (OOP) concepts such as **Encapsulation**, **Inheritance**, **Polymorphism**, and **Abstraction**.

---

## 🛠️ Features

- **Account Management**: Create regular, savings (with interest), and checking accounts (with overdraft limit).
- **Account Listing**: View all registered accounts within the system.
- **Transactions**: Deposit, withdraw, and transfer funds between accounts safely.
- **Exception Handling**: Protects against invalid inputs, insufficient balances, and missing account records.
- **Enum Support**: Type-safe account classification using Java `enum`.

---

## 📁 Project Structure

- **bank-account-management/**
    - **src/**
        - **com/bank/**
            - **enums/**
                - `AccountType.java`
            - **exception/**
                - `InsufficientBalanceException.java`
            - **model/**
                - `Account.java`
                - `CheckingAccount.java`
                - `Customer.java`
                - `SavingsAccount.java`
                - `Transaction.java`
            - **service/**
                - `BankService.java`
            - `Main.java`

## ⚙️ Requirements

- **Java Development Kit (JDK)**: Version 17 or higher recommended.
- **IDE/Text Editor**: VS Code, IntelliJ IDEA, Eclipse, or Command Line Interface (CLI).

---

## 🚀 Getting Started

### 1. Clone or Open the Repository

Navigate to your working directory:

```bash
git clone [https://github.com/khisan/bank-account-management.git](https://github.com/your-username/bank-account-management.git)
cd bank-account-management
```
````

````

### 2. Compile and Run via Terminal

Make sure you are in the **`src`** directory before compiling to prevent package path errors:

```bash
# Navigate to the source folder
cd src

# Compile all Java files
javac com/bank/Main.java com/bank/model/*.java com/bank/service/*.java com/bank/enums/*.java

# Run the application
java com.bank.Main

```

---

## 💻 How to Use

When you run the application, you will interact with an interactive terminal menu:

```
=== Menu Bank ===
1. Create New Account (Savings / Checking / Regular)
2. List All Accounts
3. Deposit Funds
4. Withdraw Funds
5. Transfer Funds
6. Exit

```

1. Select **Option 1** to create an account. The system will automatically generate a unique Account Number (e.g., `ACC171000000`).
2. Use **Option 2** to view generated account details.
3. Use the Account Number to perform **Deposit**, **Withdrawal**, or **Transfer** operations.

---

## 🔑 Core OOP Concepts Applied

- **Encapsulation**: Encapsulating account balances and fields using `private` modifiers and offering access via getter/setter methods.
- **Inheritance**: `CheckingAccount` and `SavingsAccount` inherit shared properties and behavior from the base `Account` class.
- **Polymorphism**: Overriding the `withdraw()` method to handle custom overdraft logic in checking accounts vs. standard limits in savings accounts.
- **Abstractions & Service Layer**: Separating business operations (`BankService`) from UI presentation logic (`Main.java`).

---

## 📝 License

This project is open-source and available under the [MIT License](https://www.google.com/search?q=LICENSE).
````

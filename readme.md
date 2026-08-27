````markdown
# 🏦 Bank Account Management System

A simple, robust, and object-oriented Java command-line application for managing bank accounts, customers, and financial transactions. This project demonstrates core Object-Oriented Programming (OOP) concepts including **Encapsulation**, **Inheritance**, **Polymorphism**, and **Abstraction**.

---

## 🛠️ Features

- **Multiple Account Types**: Support for Regular Accounts, Savings Accounts (with interest rate calculations), and Checking Accounts (with overdraft limits).
- **Account Listing**: View all registered bank accounts with real-time balance status.
- **Safe Transactions**: Perform deposits, withdrawals, and inter-account transfers.
- **Type-Safe Design**: Utilizes Java `Enum` for reliable account classification.
- **Error Handling**: Custom exception handling for low balance and invalid operations.

---

## 📁 Project Structure

```text
bank-account-management/
└── src/
    └── com/
        └── bank/
            ├── enums/
            │   └── AccountType.java
            ├── exception/
            │   └── InsufficientBalanceException.java
            ├── model/
            │   ├── Account.java
            │   ├── CheckingAccount.java
            │   ├── Customer.java
            │   ├── SavingsAccount.java
            │   └── Transaction.java
            ├── service/
            │   └── BankService.java
            └── Main.java
```
````

---

## ⚙️ Prerequisites

- **Java Development Kit (JDK)**: Version 17 or higher recommended.
- **IDE / Text Editor**: VS Code, IntelliJ IDEA, or Terminal.

---

## 🚀 Getting Started & Execution

### 1. Open Project Directory

Open your terminal and navigate to the root directory of the project:

```bash
cd bank-account-management

```

### 2. Compile and Run via CLI

> ⚠️ **Important**: Always compile from inside the `src` directory to maintain correct package declarations (`com.bank.*`).

```bash
# Navigate to the source folder
cd src

# Compile all Java source files
javac com/bank/Main.java com/bank/model/*.java com/bank/service/*.java com/bank/enums/*.java com/bank/exception/*.java

# Run the Main class
java com.bank.Main

```

---

## 💡 How It Works (CLI Navigation)

Upon launching the application, you will be presented with an interactive menu:

```text
=== Menu Bank ===
1. Create New Account (Savings / Checking / Regular)
2. List All Accounts
3. Deposit Funds
4. Withdraw Funds
5. Transfer Funds
6. Exit

```

1. **Create Account**: Generates a unique Account Number (e.g., `ACC171000000`) based on timestamps.
2. **List Accounts**: Displays all created accounts along with current balance and account types.
3. **Transactions**: Input the specific Account Number to process deposits, withdrawals, or money transfers.

---

## 🔑 Core OOP Concepts Applied

- **Encapsulation**: State fields (`balance`, `accountNumber`) are kept `private` and accessed exclusively through methods/getters/setters.
- **Inheritance**: `SavingsAccount` and `CheckingAccount` extend the base `Account` class to share common attributes.
- **Polymorphism**: Customized behaviors for `withdraw()` logic depending on whether the target is a Checking Account (overdraft allowed) or Savings Account.
- **Layered Architecture**: Decoupling the User Interface (`Main.java`) from the Core Logic (`BankService.java`).

---

## 📝 License

This project is open-source and available under the [MIT License](https://www.google.com/search?q=LICENSE).

```

```

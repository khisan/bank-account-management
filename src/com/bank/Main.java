package com.bank;

import com.bank.model.Account;
import com.bank.model.AccountType;
import com.bank.model.CheckingAccount;
import com.bank.model.SavingsAccount;
import com.bank.service.BankService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        BankService bankService = new BankService();

        while (running) {
            System.out.println("=== Menu Bank ===");
            System.out.println("1. Buat Akun Baru");
            System.out.println("2. List Akun");
            System.out.println("3. Deposit");
            System.out.println("4. Tarik Tunai");
            System.out.println("5. Transfer");
            System.out.println("6. List Akun");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Create Account
                    System.out.print("Masukkan nama pemilik akun: ");
                    String owner = scanner.nextLine();
                    System.out.print("Masukkan saldo awal: ");
                    double initialBalance = scanner.nextDouble();
                    System.out.print("Masukkan tingkat bunga (untuk akun tabungan): ");
                    double interestRate = scanner.nextDouble();
                    AccountType.Type selectedType = null;
                    scanner.nextLine(); // Consume newline
                    System.out.print("Pilih jenis akun (1. Checking, 2. Savings): ");
                    int accountTypeChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Account newAccount;
                    if (accountTypeChoice == 1) {
                        selectedType = AccountType.Type.CHECKING;
                        newAccount = new CheckingAccount("ACC" + System.currentTimeMillis(), initialBalance, owner);
                    } else if (accountTypeChoice == 2) {
                        selectedType = AccountType.Type.SAVINGS;
                        newAccount = new SavingsAccount(
                            "ACC" + System.currentTimeMillis(),
                            initialBalance,
                            owner,
                            interestRate
                        );
                    } else {
                        System.out.println("Jenis akun tidak valid.");
                        break;
                    }

                    bankService.createAccount(selectedType, initialBalance, owner, interestRate);
                    break;
                case 2:
                    bankService.getAllAccounts();
                    break;
                case 3:
                    // Withdraw
                    // Implementasi withdraw
                    break;
                case 4:
                    // Transfer
                    // Implementasi transfer
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    running = false;
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}

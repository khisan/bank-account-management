package com.bank.main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Pilih Menu:");
      System.out.println("1. Transfer");
      System.out.println("2. Cek Saldo");
      System.out.println("3. Deposit");
      System.out.println("4. Transfer");
      System.out.println("5. Keluar");

      System.out.println("Masukkan pilihan Anda: ");
      int choice = scanner.nextInt();
      if (choice == 1) {
            System.out.println("Transfer");
        } else if (choice == 2) {
            System.out.println("Cek Saldo");
        } else if (choice == 3) {
            System.out.println("Deposit");
        } else if (choice == 4) {
            System.out.println("Transfer");
        } else if (choice == 5) {
            System.out.println("Keluar");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
      }
}
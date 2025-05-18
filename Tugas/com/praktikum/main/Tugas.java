package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        User user = null;
        String nama, nim, password;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan username Admin: ");
                String inputUsername = scanner.nextLine();
                System.out.print("Masukkan password Admin: ");
                String inputPassword = scanner.nextLine();

                Admin admin = new Admin("admin", "000", "Admin048", "password048");

                if (admin.login(inputUsername, inputPassword)) {
                    admin.displayInfo();
                    admin.displayAppMenu();
                } else {
                    System.out.println("Login gagal, Username atau password salah.");
                }
                break;


            case 2:
                System.out.print("Masukkan Nama Mahasiswa: ");
                nama = scanner.nextLine();
                System.out.print("Masukkan NIM Mahasiswa: ");
                nim= scanner.nextLine();

                user = new Mahasiswa("rafi", "202410370110048");
                if (user.login(nama, nim)) {
                    user.displayInfo();
                    user.displayAppMenu();
                } else {
                    System.out.println("Login gagal, Nama atau NIM salah.");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid");
                break;
        }

        scanner.close();
    }
}


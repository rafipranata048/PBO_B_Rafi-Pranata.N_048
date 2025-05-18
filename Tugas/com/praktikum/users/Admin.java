package com.praktikum.users;
import com.praktikum.actions.AdminActions;

import java.util.Scanner;

public class Admin extends User implements AdminActions{

    private String Username ;
   private String Password ;

   public Admin(String nama, String nim, String username, String password ){
       super(nama, nim);
       this.Username = username;
       this.Password = password;
   }

   @Override
    public boolean login(String inputUsername, String inputPassword ){ //dgn nama metode
        return inputUsername.equals(Username) && inputPassword.equals(Password);
    }

    @Override
    public void displayInfo(){
       System.out.println("login admin berhasil");
    }

    @Override
    public void manageItems(){
       System.out.println("Fitur kelola barang belum tersedia");
    }
    @Override
    public void manageUsers(){
       System.out.println("Fitur kelola mahasiswa belum tersedia");
    }
    @Override
    public void displayAppMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean login = true;
        while (login){
            System.out.println("Menu Admin: ");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");

            System.out.println("Pilih Menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan){
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 0:
                    login = false;
                     break;
                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
        }
    }
}

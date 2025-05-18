package com.praktikum.users;
import com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;
public class Mahasiswa extends User implements MahasiswaActions{
    public Mahasiswa(String nama, String nim){
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim ){ //dgn nama metode
        return inputNama.equals(getNama()) && inputNim.equals(getNim());
    }
    @Override
    public void displayInfo(){ //dgn nama metode
        System.out.println("Login Mahasiswa berhasil");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " +  getNim());
    }
    @Override
    public void reportItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.println("Masukan Deskripsi Barang: ");
        String deskripsiBarang = scanner.nextLine();
        System.out.println("Masukan Lokasi Terakhir Barang: ");
        String lokasiBarang = scanner.nextLine();

        System.out.println("Laporan Barang: "+namaBarang + "telah diterima");
    }
    @Override
    public void viewReportedItems(){
        System.out.println("Fitur Lihat Laporan Belum Tersedia");
    }
    @Override
    public void displayAppMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean login = true;
        while (login){
            System.out.println("Menu Mahasiswa: ");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");

            System.out.println("Pilih Menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan){
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    login = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}
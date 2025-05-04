import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("admin", "000","Admin048", "password048");
        Mahasiswa mahasiswa = new Mahasiswa("Rafi Pranata", "202410370110048");

        System.out.println("Pilih Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                if (admin.login(username, password)) {
                    admin.displayInfo();
                } else {
                    System.out.println("Login gagal, Username atau password salah.");
                }
                break;

            case 2:
                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                if (mahasiswa.login(nama, nim)) {
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("Login gagal, Nama atau NIM salah.");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }

        scanner.close();//berfungsi untuk menghemat resource spt memori
    }
}


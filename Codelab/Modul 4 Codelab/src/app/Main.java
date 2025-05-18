package app;
import perpustakaan.*;

public class Main {
    public static void main(String[] args) {

        Buku nonFiksi = new NonFiksi("Gestapu65", " Salim Said", "Sejarah & Ilmu Pengetahuan");
        Buku fiksi = new Fiksi("Harry Potter", "J.K Rowling", "Sastra Fantasi");

        nonFiksi.displayInfo();
        fiksi.displayInfo();
        System.out.println();


        Anggota anggota1 = new Anggota("Rafi Pranata", "B048");
        Anggota anggota2 = new Anggota("Pascal", "B055");

        anggota1.displayInfo();
        anggota2.displayInfo();
        System.out.println();


        anggota1.pinjamBuku("Gestapu65");
        anggota2.pinjamBuku("Harry Potter", 7);
        System.out.println();


        anggota1.kembalikanBuku("Gestapu65");
        anggota2.kembalikanBuku("Harry Potter");
    }
}

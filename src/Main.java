// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan1 dan hewan2
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        // Memanggil metode tampilkanInfo() dari kedua objek
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}

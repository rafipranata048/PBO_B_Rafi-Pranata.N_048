// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek rekening1 dan rekening2
        RekeningBank rekening1 = new RekeningBank("202410370110048", "Rafi", 500000);
        RekeningBank rekening2 = new RekeningBank("123456789", "Jonathan", 300000);

        // Menampilkan informasi awal kedua rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan transaksi
        rekening1.setorUang(100000);
        rekening1.tarikUang(200000);

        rekening2.setorUang(50000);
        rekening2.tarikUang(400000);
    }
}

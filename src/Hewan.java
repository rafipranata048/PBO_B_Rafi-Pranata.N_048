// Kelas Hewan
class Hewan {
    // Atribut
    String nama;
    String jenis;
    String suara;

    // Konstruktor
    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Metode untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println(); // Spasi tambahan untuk kejelasan output
    }
}


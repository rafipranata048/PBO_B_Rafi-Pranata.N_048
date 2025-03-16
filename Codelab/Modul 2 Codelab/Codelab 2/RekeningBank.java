// Kelas RekeningBank
class RekeningBank {
    // Atribut yang memiliki nama nomorRekening, namaPemilik, saldo
    String nomorRekening;
    String namaPemilik;
    double saldo;

    // Konstruktor digunakan untuk menginisialisasi objek dengan data awal.
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
        System.out.println();
    }

    // Metode untuk setor uang
    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Berhasil menyetor Rp " + jumlah);
        System.out.println("Saldo saat ini: Rp " + saldo);
        System.out.println();
    }

    // Metode untuk tarik uang
    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Berhasil menarik Rp " + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi untuk penarikan Rp " + jumlah);
        }
        System.out.println("Saldo saat ini: Rp " + saldo);
        System.out.println();
    }
}
public class Mahasiswa extends User{
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
}

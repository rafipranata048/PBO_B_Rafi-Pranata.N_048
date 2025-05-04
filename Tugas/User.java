public class User {
        private String nama;
        private String nim;

        public User(String nama, String nim){
            this.nama = nama;//parameter
            this.nim = nim;
        }

        public String getNama(){ return nama;}//mengembalikan nilai dari atribut nama
        public void setNama(String nama) { //mengubah nilai atribut
            this.nama = nama;
        }

        public String getNim() { return nim; }//mengembalikan nilai dari atribut nim
        public void setNim(String nim){ //mengubah nilai atribut
            this.nim = nim;
        }
        public boolean login(String nama, String nim){
            return this.nama.equals(nama) && this.nim.equals(nim);
        }
        public void displayInfo(){
            System.out.println("User: " + nama+", NIM: "+ nim);
        }

}

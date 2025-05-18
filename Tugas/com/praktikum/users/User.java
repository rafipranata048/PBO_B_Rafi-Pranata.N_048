package com.praktikum.users;
public abstract class User {
    private String nama;
    private String nim;

    public User(String nama, String nim){
        this.nama = nama;//parameter
        this.nim = nim;
    }

    public String getNama(){ return nama;}//mengambil nilai dari atribut nama
    public void setNama(String nama) { //mengubah nilai atribut
        this.nama = nama;
    }

    public String getNim() { return nim; }//mengambil nilai dari atribut nim
    public void setNim(String nim){ //mengubah nilai atribut
        this.nim = nim;
    }
    public abstract boolean login (String nama, String nim);
    public abstract void displayAppMenu();
    public void displayInfo(){
        System.out.println("User: " + nama+", NIM: "+ nim);
    }
}

package com.adil.pertemuan1.praktikum.Constructor;

public class Manusia {
    private String nama;
    private int umur;

    //Definisi Constructor
    //Constructor pertama = default tanpa parameter
    public Manusia(){}

    //Constructor 2
    public Manusia(String nama){
        this.nama = nama;
    }

    //Constructor 3
    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    //Definisi method
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}

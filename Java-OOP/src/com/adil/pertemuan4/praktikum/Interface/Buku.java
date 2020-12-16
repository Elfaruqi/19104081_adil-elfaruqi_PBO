package com.adil.pertemuan4.praktikum.Interface;

public class Buku {
    String judul, pengarang;
    long hargabuku;

    public Buku(String judul, String pengarang, long hargabuku) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.hargabuku = hargabuku;
    }

    public void cetakbuku() {
        System.out.println ( "\njudul\t: " + judul );
        System.out.println ( "pengarang\t: " + pengarang );
        System.out.println ( "Harga Buku\t: " + hargabuku );
        System.out.println ();

    }

}

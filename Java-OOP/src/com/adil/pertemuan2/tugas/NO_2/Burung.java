package com.adil.pertemuan2.tugas.NO_2;

public class Burung extends Binatang {
    String nama;

    public Burung(String nama) {
        this.nama = nama;
    }

    public void getNama() {
        System.out.println ( "Nama Binatang: " + nama );
    }

    public void terbang() {
        System.out.println ( "Binatang ini terbang" );
    }

}

package com.adil.pertemuan2.tugas.NO_2;

public class Ikan extends Binatang {
    String nama;

    public Ikan(String nama) {
        this.nama = nama;
    }

    public void getNama() {
        System.out.println ( "Nama Binatang: " + nama );
    }

    public void Berenang() {
        System.out.println ( "Binatang ini berenang" );
    }

}

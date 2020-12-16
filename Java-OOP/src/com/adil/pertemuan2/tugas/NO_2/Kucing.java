package com.adil.pertemuan2.tugas.NO_2;

public class Kucing extends Binatang {
    String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }

    public void getNama() {
        System.out.println ( "Nama Binatang: " + nama );
    }

    public void Meong() {
        System.out.println ( "Binatang ini mengeluarkan suara 'Meong'" );
    }
}

package com.adil.pertemuan2.tugas.NO_1;

public class Club {

    String nama;
    int tahunberdiri;
    String stadion;
    int juaraUcl;
    String deskripsi;

    public Club() {
    }

    public Club(String nama) {
        this.nama = nama;
    }

    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public Club(String nama, int tahunberdiri, String stadion) {
        this.nama = nama;
        this.tahunberdiri = tahunberdiri;
        this.stadion = stadion;
    }

    public Club(String nama, int tahunberdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunberdiri = tahunberdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;


    }

    public void getTeam() {
        System.out.println ( "Nama :" + nama + "\n" + "TahunBerdiri : " + tahunberdiri + "\n" + "Stadion : " + stadion + "\n" + "JuaraUcl : " + juaraUcl + "\n" + "Deskripsi : " + deskripsi );
    }

}
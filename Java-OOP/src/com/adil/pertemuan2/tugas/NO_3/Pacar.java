package com.adil.pertemuan2.tugas.NO_3;

public class Pacar extends Mahasiswa {
    String namaPacar;
    String lamaHubungan;

    public Pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan) {
        super ( nama, status, semester );
        this.namaPacar = namaPacar;
        this.lamaHubungan = lamaHubungan;

    }


}

package com.adil.pertemuan2.tugas.NO_3;

public class Mahasiswa {
    String nama;
    String status;
    int semester;

    public Mahasiswa(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    public void getStatus() {
        System.out.println ( "Status Mahasiswa: " + status );
    }


}

package com.adil.pertemuan4.praktikum.Abstract;

public class Kambing extends Binatang {
    private String nama;


    public Kambing(String nama) {
        super ( " Kambing " );
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println ( "mengembik" );

    }

    @Override
    public String toString() {
        return super.toString () + " " + nama;
    }
}

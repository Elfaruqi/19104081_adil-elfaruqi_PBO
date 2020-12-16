package com.adil.pertemuan2.praktikum.OverloadingMethod;

public class Lagu {

    public String judul;
    public String pencipta;

    public Lagu(String judul) {
        this.judul = judul;
        this.pencipta = "Tidak di ketahui";
    }

    public Lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;

    }

    public void getDataLagu() {
        System.out.println ( "Judul : " +
                judul + "\n" +
                "Pencipta : " +
                pencipta );
    }
}

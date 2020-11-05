package com.adil.pertemuan4.praktikum.Interface;

public class DemoInterface {
    public static void main(String[] args) {
        Paket paket = new Paket ( "PBO",
                "Bagus",
                90000,
                "800 mb",
                85000 );

        paket.hitungHargaPaket ();
        paket.cetakPaket ();
    }
}

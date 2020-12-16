package com.adil.pertemuan4.praktikum.Abstract;

import java.util.Random;

public class DemoAbstract {
    public static void main(String[] args) {
        Binatang[] peliharaanku = {
                new Burung ( "Beo" ),
                new Kambing ( "Etawa" ),
                new Kucing ( "Persia" ),
                new Anjing ( "Cihuahua" )};


        Binatang kesayangan;
        Random pilihan = new Random ();

        kesayangan = peliharaanku[pilihan.nextInt (
                peliharaanku.length )];

        System.out.println ( "Binatang kesayangan andat\t: " + kesayangan );
        System.out.println ( "Suaranya\t: " );
        kesayangan.suara ();


    }
}

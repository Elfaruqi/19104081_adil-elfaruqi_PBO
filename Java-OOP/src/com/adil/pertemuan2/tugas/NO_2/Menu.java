package com.adil.pertemuan2.tugas.NO_2;

public class Menu {
    public static void main(String[] args) {

        Binatang supperClass = new Binatang ();

        System.out.println ( "SupperClass" );
        supperClass.Makan ( "Harimau" );
        supperClass.tidur ( "Harimau" );
        System.out.println ();

        System.out.println ( "subClass = 1 " );
        Ikan subClass1 = new Ikan ( "ikan" );
        subClass1.getNama ();
        subClass1.Berenang ();
        subClass1.Makan ( subClass1.nama );
        subClass1.tidur ( subClass1.nama );
        System.out.println ();


        System.out.println ( "subClass = 2 " );
        Burung subClass2 = new Burung ( "burung" );
        subClass2.getNama ();
        subClass2.terbang ();
        subClass2.Makan ( subClass2.nama );
        subClass2.tidur ( subClass2.nama );
        System.out.println ();


        System.out.println ( "subClass = 3 " );
        Kucing subClass3 = new Kucing ( "kucing" );
        subClass3.getNama ();
        subClass3.Meong ();
        subClass3.Makan ( subClass3.nama );
        subClass3.tidur ( subClass3.nama );
    }
}

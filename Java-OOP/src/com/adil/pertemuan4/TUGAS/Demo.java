package com.adil.pertemuan4.TUGAS;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Company> company = new ArrayList<> ();
        int gajiMingguan;
        long gajiPokok;
        long komisi;
        long penjualan;

        System.out.println ( "DATA PERUSAHAAN" );
        System.out.println ();

        System.out.println ( "Pegawai Salaried" );
        System.out.println ( "====================" );
        System.out.println ( "Nama Pegawai\t: Amber" );
        System.out.println ( "Nip\t: 1110103451001" );
        System.out.println ( "Gaji Mingguan\t: 4500000" );
        System.out.println ();


        System.out.println ( "Pegawai Commision" );
        System.out.println ( "====================" );
        System.out.print ( "Nama Pegawai\t: Klee " );
        System.out.print ( "\nNip\t: 1110103452002" );
        System.out.println ( "\nGaji Mingguan\t: 750000 " );
        System.out.println ( "Komisi\t: 3000000" );
        System.out.println ( "Total Penjualan\t: 35 " );
        System.out.println ();


        System.out.println ( "Pegawai Project Planner" );
        System.out.println ( "====================" );
        System.out.print ( "Nama Pegawai\t: Dailuc" );
        System.out.print ( "\nNip\t: 11101034513003" );
        System.out.println ( "\nGaji Mingguan\t: 800000" );
        System.out.println ( "Komisi\t: 3800000" );
        System.out.println ( "Total Hasil Proyek\t: 50" );
        System.out.println ();


    }
}

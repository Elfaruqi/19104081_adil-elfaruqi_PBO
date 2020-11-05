package com.adil.pertemuan3.praktikum.ASOSIASI;

public class DemoKuliah {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa ();
        mahasiswa1.setNama ( "Paimon" );
        mahasiswa1.setNim ( 21104001 );

        Mahasiswa mahasiswa2 = new Mahasiswa ( 21104002, "Amber" );

        Dosen dosen = new Dosen ();

        dosen.setKodeDosen ( "AWC" );
        dosen.setNimMhs ( mahasiswa1.getNim () );
        dosen.setNimMhs ( mahasiswa2.getNim () );

        System.out.println ( "Kode Dosen : " + dosen.getKodeDosen () );
        System.out.println ( "Mengajar Mahasiswa : " );

        for (int i = 0; i < dosen.getJmlMahasiswa (); i++) {
            System.out.println ( "- " + dosen.getNimMhs ( i ) );
        }
    }
}

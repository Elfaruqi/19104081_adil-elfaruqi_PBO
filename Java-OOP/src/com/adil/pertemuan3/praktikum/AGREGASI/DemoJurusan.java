package com.adil.pertemuan3.praktikum.AGREGASI;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {

    public static void main(String[] args) {
        Jurusan jurusanSE = new Jurusan ( "2110", "software Engineering" );

        Mahasiswa mahasiswa1 = new Mahasiswa ( "Paimon", 21104001 );
        Mahasiswa mahasiswa2 = new Mahasiswa ( "Tabi bito", 21104002 );
        Mahasiswa mahasiswa3 = new Mahasiswa ( "Barabara", 21104003 );

        List<Mahasiswa> mahasiswaList = new ArrayList<> ();

        mahasiswaList.add ( mahasiswa1 );
        mahasiswaList.add ( mahasiswa2 );
        boolean fischl = mahasiswaList.add ( new Mahasiswa ( "Fischl", 21104004 ) );

        jurusanSE.setMahasiswaList ( mahasiswaList );
        jurusanSE.add ( mahasiswa3 );
        jurusanSE.printDataJurusan ();

    }
}

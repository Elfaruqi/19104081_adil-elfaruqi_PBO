package com.adil.pertemuan3.tugas.NO_3;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        Keluarga keluarga = new Keluarga ( "Family", "Banda Aceh" );

        ArrayList<Anak> anakList = new ArrayList<> ();

        keluarga.addAnggotaKeluarga ( new Ayah ( 1, "Nasir", 53 ),
                new Ibu ( 2, "Suriani", 48 ), anakList );

        anakList.add ( new Anak ( 3, "adil", 19, " Anak Kandung" ) );
        anakList.add ( new Anak ( 4, "Sanaya", 18, " Anak Kandung" ) );

        keluarga.getDataKeluarga ();
    }
}

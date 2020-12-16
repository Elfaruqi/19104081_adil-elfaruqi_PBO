package com.adil.pertemuan3.tugas.NO_1;

public class Demo {
    public static void main(String[] args) {


        Komplek komplek = new Komplek ( "B-Komplek", "Perumnas" );

        Rumah rumah1 = new Rumah ( "B-01", "", 2 );
        Rumah rumah2 = new Rumah ( "B-02", "", 4 );
        Rumah rumah3 = new Rumah ( "B-03", "", 6 );
        Rumah rumah4 = new Rumah ( "B-04", "", 8 );


        komplek.addRumah ( rumah1.getIdRumah () );
        komplek.addRumah ( rumah2.getIdRumah () );
        komplek.addRumah ( rumah3.getIdRumah () );
        komplek.addRumah ( rumah4.getIdRumah () );

        komplek.getDataKomplek ();

    }

}

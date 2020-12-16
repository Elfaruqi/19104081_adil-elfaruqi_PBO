package com.adil.pertemuan3.tugas.NO_2;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Planet> planetList = new ArrayList<> ();

        SolarSystem solarSystem = new SolarSystem ( "000", "Planet" );

        Planet planet01 = new Planet ( 1, 1, "Merkurius" );
        Planet planet02 = new Planet ( 2, 2, "Venus" );
        Planet planet03 = new Planet ( 3, 3, "Bumi" );
        Planet planet04 = new Planet ( 4, 4, "Mars" );
        Planet planet05 = new Planet ( 5, 5, "Jupiter" );
        Planet planet06 = new Planet ( 6, 6, "Saturnus" );
        Planet planet07 = new Planet ( 7, 7, "Uranus" );
        Planet planet08 = new Planet ( 8, 8, "Neptunus" );

        planetList.add ( planet01 );
        planetList.add ( planet02 );
        planetList.add ( planet03 );
        planetList.add ( planet04 );
        planetList.add ( planet05 );
        planetList.add ( planet06 );
        planetList.add ( planet07 );
        planetList.add ( planet08 );

        solarSystem.setPlanetList ( planetList );

        solarSystem.getData ();


    }
}

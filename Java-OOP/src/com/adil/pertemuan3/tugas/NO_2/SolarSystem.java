package com.adil.pertemuan3.tugas.NO_2;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    String id;
    String nama;
    List<Planet> planetList = new ArrayList<> ();

    public SolarSystem(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getTotalMember() {
        return getPlanets ().size ();
    }

    List<Planet> getPlanets() {
        return planetList;
    }

    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void getData() {
        System.out.println ( "Id Solar System\t: " + getId () );
        System.out.println ( "Nama Solar System\t: " + getNama () );
        System.out.println ( "Total Member\t: " + getTotalMember () );
        System.out.println ();
        for (Planet planet : planetList) {
            System.out.println ( "- Id Planet\t: " + planet.getIdPlanet () );
            System.out.println ( "- urutan Planet\t: " + planet.getUrutanPlanet () );
            System.out.println ( "- Nama Planet\t: " + planet.getNamaPlanet () );
        }
    }
}

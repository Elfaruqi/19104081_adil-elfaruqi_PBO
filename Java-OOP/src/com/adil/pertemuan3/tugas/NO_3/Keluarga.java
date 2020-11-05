package com.adil.pertemuan3.tugas.NO_3;

import java.util.ArrayList;
import java.util.List;

public class Keluarga {


    String namaKeluarga;
    String kotaAsal;
    List<Anak> anakList = new ArrayList<> ();
    private Ayah ayah;
    private Ibu ibu;


    public Keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }

    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public void addAnggotaKeluarga(Ayah ayah, Ibu ibu, ArrayList<Anak> anakList) {
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakList = anakList;
    }

    public List<Anak> getAnakList() {
        return anakList;
    }

    public Ayah getAyah() {
        return ayah;
    }

    public Ibu getIbu() {
        return ibu;
    }

    public void getDataKeluarga() {
        System.out.println ( "Nama keluarga\t: " + getNamaKeluarga () );
        System.out.println ( "kota Asal\t; " + getKotaAsal () );
        System.out.println ();

        System.out.println ( "Id Ayah\t: " + getAyah ().getIdAyah () );
        System.out.println ( "Nama Ayah\t: " + getAyah ().getNamaAyah () );
        System.out.println ( "Umur Ayah\t: " + getAyah ().getUmurAyah () );


        System.out.println ( "Id Ibu\t: " + getIbu ().getIdIbu () );
        System.out.println ( "Nama Ibu\t: " + getIbu ().getNamaIbu () );
        System.out.println ( "Umur Ibu\t: " + getIbu ().getUmurIbu () );

        System.out.println ( "Jumlah Anak\t: " + getAnakList ().size () );
        System.out.println ();


        for (Anak anak : anakList) {
            System.out.println ( "Nama Anak\t: " + anak.getNamaAnak () );
            System.out.println ( "Id Anak\t: " + anak.getIdAnak () );
            System.out.println ( "Umur Anak\t:" + anak.getUmurAnak () );
            System.out.println ( "Status Anak: " + anak.getStatusAnak () );
            System.out.println ();
        }


    }
}

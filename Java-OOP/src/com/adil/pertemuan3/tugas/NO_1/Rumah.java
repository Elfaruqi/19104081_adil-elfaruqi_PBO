package com.adil.pertemuan3.tugas.NO_1;

public class Rumah {
    String idRumah;
    String pemilikRumah;
    int jumlahOrang;

    public Rumah(String idRumah, String pemilikRumah, int jumlahOrang) {
        this.idRumah = idRumah;
        this.pemilikRumah = pemilikRumah;
        this.jumlahOrang = jumlahOrang;
    }


    public String getIdRumah() {
        return idRumah;
    }

    public String getPemilikRumah() {
        return pemilikRumah;
    }

    public int getJumlahOrang() {
        return jumlahOrang;
    }
}

package com.adil.pertemuan4.praktikum.Abstract;

//Class abstract
public abstract class Binatang {
    private String jenis;


    public Binatang(String jenis) {
        this.jenis = jenis;
    }

    //Method abstract
    protected abstract void suara();

    @Override
    public String toString() {
        return "Seekor" + jenis;
    }
}

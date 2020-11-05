package com.adil.pertemuan4.TUGAS;

public abstract class Company {
    String jenisEmployee;

    public Company(String jenisEmployee) {
        this.jenisEmployee = jenisEmployee;
    }

    @Override
    public String toString() {
        return "Jenis Pegawai\t: " + jenisEmployee;
    }

    protected abstract void Salaried();

}

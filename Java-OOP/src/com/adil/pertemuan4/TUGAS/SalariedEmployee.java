package com.adil.pertemuan4.TUGAS;

public class SalariedEmployee extends Company {

    String nama;
    String nip;
    int upahMingguan;

    public SalariedEmployee(String nama, String nip, int upahMingguan) {
        super ( "Salaried Employee" );
        this.nama = nama;
        this.nip = nip;
        this.upahMingguan = upahMingguan;
    }

    public void Salaried() {
        System.out.println ( "Gaji Pengawai\t: " );
        System.out.println ( "Upah Mingguan\t: Rp. " + upahMingguan );
        System.out.println ();


    }

    public String toString() {
        return super.toString () + "Nama Pegawai\t: " + nama + " Nip\t: " + nip;
    }

}

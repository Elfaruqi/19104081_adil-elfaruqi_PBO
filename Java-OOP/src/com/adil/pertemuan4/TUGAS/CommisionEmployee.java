package com.adil.pertemuan4.TUGAS;

public class CommisionEmployee extends Company {
    String nama;
    String nip;
    long gajiPokok;
    long komisi;
    long totalPenjualan;

    public CommisionEmployee(String jenisEmployee, String nama, String nip, long gajiPokok, long komisi, long totalPenjualan) {
        super ( jenisEmployee );
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }

    @Override
    protected void Salaried() {
        System.out.println ( "Gaji Pegawai\t: " );
        System.out.println ( "\t Gaji Pokok\t: Rp. " + gajiPokok );
        System.out.println ( "\t Komisi\t: Rp. " + komisi );
        System.out.println ( "\t Total Penjualan\t: Rp. " + totalPenjualan );
        System.out.println ( "\t Gaji Total\t: Rp. " + (gajiPokok + (komisi * totalPenjualan)) );


    }

    @Override
    public String toString() {
        return super.toString () + "Nama Pegawai\t: " + nama + " Nip\t: " + nip;
    }
}

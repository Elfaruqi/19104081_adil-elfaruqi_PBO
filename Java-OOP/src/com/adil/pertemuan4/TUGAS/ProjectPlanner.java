package com.adil.pertemuan4.TUGAS;

public class ProjectPlanner extends Company {
    String nama;
    String nip;
    long gajiPokok;
    long komisi;
    long totalHasilProyek;

    public ProjectPlanner(String jenisEmployee, String nama, String nip, long gajiPokok, long komisi, long totalHasilProyek) {
        super ( jenisEmployee );
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalHasilProyek = totalHasilProyek;
    }

    @Override
    protected void Salaried() {
        long total = gajiPokok + (komisi * totalHasilProyek);
        System.out.println ( "Gaji Pegawai\t: " );
        System.out.println ( "\t Gaji Pokok\t: Rp. " + gajiPokok );
        System.out.println ( "\t Komisi\t: Rp. " + komisi );
        System.out.println ( "\t Total Hasil Proyek\t: " + totalHasilProyek );
        System.out.println ( "\t Gaji Total\t: Rp. " + total );
    }


    public String toString() {
        return super.toString () + "Nama Pegawai\t: " + nama + " Nip\t: " + nip;
    }

}


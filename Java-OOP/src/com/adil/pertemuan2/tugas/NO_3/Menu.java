package com.adil.pertemuan2.tugas.NO_3;

public class Menu {

    public static void main(String[] args) {

        String nama = "Dailuc", status = "aktif";
        int semester = 3;

        System.out.println ( "NamaMahasiswa  : " + nama );
        System.out.println ( "StatusMahasiswa: " + status );
        System.out.println ( "Semester: " + semester );

        Mahasiswa mahasiswa = new Mahasiswa ( nama, status, semester );
        mahasiswa.getStatus ();
        System.out.println ();

        String namaPacar = "Jean";
        String lamaHubungan = "1 tahun";

        System.out.println ( "Nama Pacar: " + namaPacar );
        System.out.println ( "Lama Hubungan: " + lamaHubungan );

        Mahasiswa pacar = new Pacar ( nama, status, semester, namaPacar, lamaHubungan );
        pacar.getStatus ();
    }
}

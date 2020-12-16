package com.adil.pertemuan1.tugas.No_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pendaftaran {


    public static void main(String[] args) {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int data =0;
        String[] nama    = new String[30];
        String[] nim     = new String[15];
        String[] jurusan = new String[10];
        String[] alamat  = new String[50];

        System.out.println("BIODATA MAHASISWA");
        System.out.println("+===============INPUTAN============================+");
        try{
            System.out.println("Masukkan banyak data = ");
            data = Integer.parseInt(input.readLine());
            for (int a=1;a<=data;a++){
                System.out.println("------Data ke-"+ a +"------");
                System.out.println("Masukan Nim        = ");
                nim[a] = input.readLine();
                System.out.println("Masukan Nama       = ");
                nama[a] = input.readLine();
                System.out.println("Masukan Jurusan    = ");
                jurusan[a] = input.readLine();
                System.out.println("Masukan Alamat = ");
                alamat[a] = input.readLine();
            }
        } catch (IOException e ){
            System.out.println("Error");
        }

        System.out.println("+==============HASIL OUTPUT========================+");
        System.out.println("Banyak data : " + data);
        for (int a=1; a<=data;a++){
            System.out.println("Data Mahasiswa ke- " + a);
            System.out.println("Nim     : "+ nim[a]);
            System.out.println("Nama    : "+ nama[a]);
            System.out.println("Alamat  : "+ alamat[a]);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("selamat, anda terdaftar");
        }

    }
}

package com.adil.pertemuan5.praktikum.TRY_CATCH;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Try_Catch {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File ( "D:\\New\\Paimon.txt" );
            FileReader fileReader = new FileReader ( file );

            System.out.println ( "Read file berhasil" );
        } catch (Exception e) {
            System.out.println ( e.getMessage () );
        }
    }
}

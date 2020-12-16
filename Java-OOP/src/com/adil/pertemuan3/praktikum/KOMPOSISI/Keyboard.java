package com.adil.pertemuan3.praktikum.KOMPOSISI;

public class Keyboard {
    private String merk;
    private String type;

    public Keyboard(String merk, String type) {
        this.merk = merk;
        this.type = type;
    }

    public void PrintSpec() {
        System.out.println ( "- Merk\t: " + merk );
        System.out.println ( "- Type\t: " + type );
        System.out.println ();
    }
}





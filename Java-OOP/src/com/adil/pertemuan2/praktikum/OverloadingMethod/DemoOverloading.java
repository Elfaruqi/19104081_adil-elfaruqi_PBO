package com.adil.pertemuan2.praktikum.OverloadingMethod;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu ( "Badai telah berlalu" );
        Lagu lagu2 = new Lagu ( "Halu", "Feby" );

        lagu1.getDataLagu ();
        lagu2.getDataLagu ();
    }
}

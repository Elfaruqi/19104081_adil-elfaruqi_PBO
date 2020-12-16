package com.adil.pertemuan2.praktikum.OverridingMethod;

public class DemoOverriding {

    public static void main(String[] args) {
        X superclass = new X ();
        Y subclass = new Y ();

        superclass.getValue ( "Tidur" );
        subclass.getValue ( "Makan" );
    }
}

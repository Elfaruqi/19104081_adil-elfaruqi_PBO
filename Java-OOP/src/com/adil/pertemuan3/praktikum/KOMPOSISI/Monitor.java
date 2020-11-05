package com.adil.pertemuan3.praktikum.KOMPOSISI;

public class Monitor {
    private String merk;
    private String size;
    private String refreshRate;


    public Monitor(String merk, String size, String refreshRate) {
        this.merk = merk;
        this.size = size;
        this.refreshRate = refreshRate;
    }

    public void PrintSpec() {
        System.out.println ( "- Merk\t: " + merk );
        System.out.println ( "- Size\t: " + size + " inch" );
        System.out.println ( "- Refresh Rate\t: " + refreshRate + " Hz" );
        System.out.println ();
    }
}

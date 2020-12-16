package com.adil.pertemuan1.tugas.No_1;

public class Fahrenheit {
    double toReamur(){
        //°Ré = (°F − 32) / 2,25
        return ((Suhu.SuhuAwal-32)/2.25);
    }
    double toKelvin(){
        //K = (°F + 459,67) / 1,8
        return ((Suhu.SuhuAwal+459.67)/ 1.8);
    }
    double toCelcius(){
        //°C = (°F − 32) / 1,8
        return ((Suhu.SuhuAwal-32)/1.8);
    }
}


package com.adil.pertemuan1.tugas.No_1;

public class Kelvin {

    double toFahrenheit(){
        //°F = K × 1,8 − 459,67
        return (Suhu.SuhuAwal*1.8-459.67);
    }
    double toReamur(){
        //°Ré = (K − 273,15) × 0,8
        return ((Suhu.SuhuAwal-273.15)*0.8);
    }
    double toCelcius(){
        //°C = K − 273,15
        return (Suhu.SuhuAwal-273.15);
    }
}

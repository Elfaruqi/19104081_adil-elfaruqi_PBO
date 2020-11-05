package com.adil.pertemuan1.tugas.No_1;

public class Celcius {

    double toFahrenheit(){
        //°F = °C × 1,8 + 32
        return (Suhu.SuhuAwal*1.8+32);
    }
    double toReamur(){
        //°Ré = °C × 0,8
        return (Suhu.SuhuAwal*0.8);
    }
    double toKelvin(){
        //K = °C + 273,15
        return (Suhu.SuhuAwal+273.15);
    }

}

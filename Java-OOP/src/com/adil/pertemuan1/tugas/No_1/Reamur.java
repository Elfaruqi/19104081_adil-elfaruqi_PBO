package com.adil.pertemuan1.tugas.No_1;

public class Reamur {
    double toFahrenheit(){
        //°F = °Ré × 2,25 + 32
        return (Suhu.SuhuAwal*2.25+32);
    }
    double toKelvin(){
        //K = °Ré / 0,8 + 273,15
        return (Suhu.SuhuAwal/0.8+237.15);
    }
    double toCelcius(){
        //°C = °Ré / 0,8
        return (Suhu.SuhuAwal/0.8);
    }

}

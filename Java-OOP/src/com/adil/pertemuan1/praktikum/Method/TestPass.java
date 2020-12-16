package com.adil.pertemuan1.praktikum.Method;

public class TestPass {
    int nomer1, nomer2;

    public TestPass(int nomer1, int nomer2) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }

    //Passed by value
    void calculate (int m, int n){
        m = m * 10 ;
        n = n / 2;
    }

    //Passed by reference
    void calculate (TestPass pass){
        pass.nomer1 = pass.nomer1 * 10;
        pass.nomer2 = pass.nomer2 / 2;
    }
}

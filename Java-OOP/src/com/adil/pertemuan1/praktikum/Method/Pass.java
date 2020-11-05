package com.adil.pertemuan1.praktikum.Method;

public class Pass {

    public static void main(String[] args) {
        int nomer1, nomer2;

        TestPass pass = new TestPass(50, 100);
        nomer1 = 10;
        nomer2 = 20;

        //Passed by value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("Nomer1\t: " + nomer1);
        System.out.println("Nomer2\t: " + nomer2);

        pass.calculate(nomer1, nomer2);
        System.out.println("Nilai setelah passed by value\t: ");
        System.out.println("Nomer1\t: " + nomer1);
        System.out.println("Nomer2\t: " + nomer2);
        System.out.println();

        //Passed by reference
        System.out.println("Nilai sebelum passed by reference\t: ");
        System.out.println("passed.nomer1\t: " + pass.nomer1);
        System.out.println("passed.nomer2\t: " + pass.nomer2);

        pass.calculate(pass);
        System.out.println("Nilai sebelum passed by reference\t: ");
        System.out.println("passed.nomer1\t: " + pass.nomer1);
        System.out.println("passed.nomer2\t: " + pass.nomer2);
    }
}

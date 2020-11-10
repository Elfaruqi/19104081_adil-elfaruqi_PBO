package com.adil.pertemuan5.praktikum.MULTIPLE_CATCH;

public class Multi_Try_1 {
    public static void main(String[] args) {
        //Deklrasi Array
        int[] array = new int[5];

        //Multi Try catch

        try {
            array[5] = 15 / 0;
            System.out.println ( array[5] );
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println ( "Arithmetic Exception" );
            System.out.println ( "ArrayIndexOutOfBounds" );
        }
    }
}

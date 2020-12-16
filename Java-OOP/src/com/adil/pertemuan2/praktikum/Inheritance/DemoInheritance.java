package com.adil.pertemuan2.praktikum.Inheritance;

public class DemoInheritance {

    public static void main(String[] args) {
        A superclass = new A ();
        B subclass = new B ();

        System.out.println ( "Int SuperClass :" );
        superclass.x = 3;
        superclass.y = 4;
        superclass.printXy ();

        // member superclass dapat diakses oleh
        // sub class nya
        System.out.println ( "ini Subclass :" );
        subclass.x = 1;
        subclass.y = 2;
        subclass.printXy ();

        //member tambahan pada sub class
        subclass.z = 5;
        subclass.sumValue ();

    }
}

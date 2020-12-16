package com.adil.pertemuan2.praktikum.VirtualMethodInvocation;

public class DemoVMI {

    public static void main(String[] args) {
        Child child = new Child ();
        Parent parentChild = new Child ();

        child.getData ();
        parentChild.getData ();
    }
}

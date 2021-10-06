package com.company;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {
        int[] arrSimple = {5, 3, 7, 6, 2, 8};
        forMethod(arrSimple);
        System.out.println();
        forEachMethod(arrSimple);
        System.out.println();
        whileMethod(arrSimple);
        System.out.println();
        doWhileMethod(arrSimple);
    }

    public static void forMethod(int[] arrSimple) {
        for (int i = 0; i < arrSimple.length; i++) {
            System.out.println(arrSimple[i]);
        }
    }

    public static void forEachMethod(int[] arrSimple) {
        for (int myVariable : arrSimple) {
            System.out.println(myVariable);
        }
    }

    public static void whileMethod(int[] arrSimple) {
        int i = 0;
        while (i < arrSimple.length) {
            System.out.println(arrSimple[i]);
            i++;
        }
    }

    public static void doWhileMethod(int[] arrSimple) {
        int i = 0;
        do {
            System.out.println(arrSimple[i]);
            i++;
        } while (i < arrSimple.length);
    }
}

//for each  is shortest one
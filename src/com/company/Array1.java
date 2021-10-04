package com.company;

import java.util.Scanner;

public class Array1 {
Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arrSimple = {5, 3, 7, 6, 2, 8};
        for (int i = 0; i < arrSimple.length; i++) {
            System.out.println(arrSimple[i]);
        }

        for (int myVariable : arrSimple) {
            System.out.println(myVariable);
        }
int i = 0;
   while (i<arrSimple.length) {
       System.out.println(arrSimple[i]);i++;
    }
   // only one is using at same time - while or do while, not both
    int i=0;
    do {
        System.out.println(arrSimple[i]);
        i++;
    }while (i <arrSimple.length);
    }
    }

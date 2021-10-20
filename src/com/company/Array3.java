package com.company;

import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.util.Scanner;
import java.util.Arrays;


public class Array3 {
    public static void main(String[] args) {
        byte[] gradeArray = new byte[3];
        //  enterGrades(gradeArray);
        //}

        // public static void enterGrades(byte[] gradeArray) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter grades of 10 students.");

        for (int i = 0; i < gradeArray.length; i++) {
            gradeArray[i] = input.nextByte();
        }
        System.out.println("Here are all grades: ");

        for (int i = 0; i < gradeArray.length; i++) {
            //   if (gradeArray[i] >= 0 && gradeArray[i]<=10) {
            System.out.println(gradeArray[i]);
        }
    }

}

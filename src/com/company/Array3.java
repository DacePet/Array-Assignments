package com.company;

import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.util.Scanner;
import java.util.Arrays;


public class Array3 {
    public static void main(String[] args) {
        byte[] gradeArray = new byte[10];
        enterGrades(gradeArray);
        System.out.println();
        failedStudents(gradeArray);
        excellentStudents(gradeArray);
        histogramGrades(gradeArray);
    }

    public static void enterGrades(byte[] gradeArray) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter grades of 10 students.");

        for (int i = 0; i < gradeArray.length; i++) {
            byte grade = input.nextByte();

            //grade = gradeArray;
            if (grade < 0 ||grade > 10) {
                System.exit(0);
            }
            gradeArray[i] = grade;
        }
        System.out.println("Here are all valid grades' entries: ");
        for (int i = 0; i < gradeArray.length; i++) {
            System.out.println(i + 1 + ". " + gradeArray[i]);
        }
    }

    public static void failedStudents(byte[] gradeArray) {
        int count = 0;
        for (int i = 0; i < gradeArray.length; i++) {
            if (gradeArray[i] < 4)
                count++;
        }
        System.out.println(count + " student(s)  failed.");
        System.out.println();
    }

    public static void excellentStudents(byte[] gradeArray) {
        int counter = 0;
        for (int i = 0; i < gradeArray.length; i++) {
            if (gradeArray[i] == 10)
                counter++;
        }
        System.out.println(counter + " student(s)  got 'A'.");
    }

     public static void histogramGrades(byte[] gradeArray) {
        int i = 0;
       //byte gradeArray[i] =0;
     while (gradeArray[i]<=10) {
       int counting = 0;
     for (byte grade:gradeArray){
       if (gradeArray[i] == i) {
         counting++;
    }
    System.out.println(counting + " students with the grade " + gradeArray[i]);
    gradeArray[i]++;
    }
      }
    }
}


package com.company;

import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.util.Scanner;
import java.util.Arrays;


public class Array3 {
    public static void main(String[] args) {
        byte[] gradeArray = new byte[4];

        enterGrades(gradeArray);
       failedStudents(gradeArray);
        //excellentStudents(gradeArray);
    }

    public static void enterGrades(byte[] gradeArray) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter grades of 10 students.");

        for (int i = 0; i < gradeArray.length; i++) {
            gradeArray[i] = input.nextByte();
            if (gradeArray[i] < 0 || gradeArray[i] > 10) {
                System.out.println("Check entries");
            }
        }

        System.out.println("Here are all valid grades' entries: ");

        for (int i = 0; i < gradeArray.length; i++) {
            if (gradeArray[i] >= 0 && gradeArray[i] <= 10) {

                System.out.println(i + 1 + ". " + gradeArray[i]);
                //return; - if return, it stops at first result
            } else {
                System.out.println(i + 1 + ". Check your entries.");
            }
        }
    }


    public static void failedStudents ( byte[] gradeArray){
    int i = 0;
    int count = 0;
     count++;
    //for (int i = 0; i < gradeArray.length; i++) {
      if (gradeArray[i] >= 0 && gradeArray[i] < 4) {
        System.out.println(count + " student(s)  failed.");
    //TODO Not counting
    //}


    //public static void excellentStudents(byte[] gradeArray) {
      //  int i = 0;
        //int count = 0;
        //count++;
        //switch (gradeArray[i]) {
          //  case 10:
            //    System.out.println(count + " student(s)  got 'A'.");
              //  break;
            //default:
              //  System.out.println("No student got 'A'.");


        }
    }
}




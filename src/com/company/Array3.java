package com.company;

import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.util.Scanner;
import java.util.Arrays;


public class Array3 {
    public static void main(String[] args) {
        byte[] gradeArray = new byte[3];
       // enterGrades(gradeArray);
 //   }


   // public static void enterGrades(byte[] gradeArray) {
        int i = 0;
        int studentNo = 1;

                while (true){
            System.out.println("Please enter student No. " + studentNo + "  grade.");
            Scanner input = new Scanner(System.in);
            byte grade = input.nextByte();
                    studentNo++;
            if (studentNo <= gradeArray.length && grade >= 0 && grade <= 10)
                System.out.println("Student No. " + studentNo + " grade: " + grade);
                      else
                System.out.println("Wrong input");
        }
            }
        //  for (int i = 0; i < gradeArray.length; i++) {
        //    if (grade<0 || grade>10) {
        //      System.out.println("Wrong input");
       }




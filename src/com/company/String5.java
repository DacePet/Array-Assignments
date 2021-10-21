package com.company;
import java.sql.Array;
import java.util.*;
public class String5 {
    public static void main(String[] args) {
        String testedUnit = "Was it a car or a cat I saw?";
        int i=0;
        testedUnit = testedUnit.replaceAll("[^a-zA-Z]+","").toLowerCase();
        for (int j=0;j<=testedUnit.length()-1 ;j++)
        {
            if (testedUnit.charAt(j)!=testedUnit.charAt(testedUnit.length()-j-1))
            {
                i=1;
                break;
            }
        }
        if(i==1)
            System.out.println("Sentence is not a palindrome");
        else
            System.out.println("Sentence is a palindrome");
    }
}

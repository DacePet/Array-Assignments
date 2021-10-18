package com.company;

import java.util.ArrayList;

public class DataStr1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> resultC = new ArrayList<String>();
        words.add("Computer");
        words.add("Plate");
        words.add("Chair");
        words.add("Girl");
        words.add("Boy");
        words.add("Dog");
        words.add("Shirt");
        words.add("Determination");

// count words, that start with C
        int count = 0;
        for (String i : words) {
            if (i.startsWith("C")) {
                count++;
                System.out.println("How many words start with 'C': " + count);
                //TODO printing each count, should do  just the final.
            }
              }
// count words, that contain E
int counter = 0;
        for (String i : words) {
            if (i.contains("e")) {
                counter++;
                System.out.println("How many words contain 'e': " + counter);
                //TODO printing each count, should do  just the final.
                         }
        }
// count words fo 5 letters;
        int countcount = 0;
        for (String i : words) {
            if (i.length()==5) {
                countcount++;
                System.out.println("How many words consist from 5 letters: " + countcount);
                //TODO printing each count, should do  just the final.
            }
        }
    }
}
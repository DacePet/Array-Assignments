package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class DataStr1 {
    public static void main(String[] args) {
        ArrayList<String> wordsRandom = new ArrayList<String>();
        wordsRandom.add("Computer");
        wordsRandom.add("Plate");
        wordsRandom.add("Chair");
        wordsRandom.add("Girl");
        wordsRandom.add("Boy");
        wordsRandom.add("Dog");
        wordsRandom.add("Shirt");
        wordsRandom.add("Determination");


// count words, that start with C
        int countC = 0;
        for (String i : wordsRandom) {
            if (i.startsWith("C"))
                countC++;
        }
        System.out.println("How many words start with 'C': " + countC);

// count words, that contain E
        int countEend = 0;
        for (String i : wordsRandom) {
            if (i.endsWith("e"))
                countEend++;
        }
        System.out.println("How many words end with 'e': " + countEend);

// count words fo 5 letters;
        int countFive = 0;
        for (String i : wordsRandom) {
            if (i.length() == 5)
                countFive++;
        }
        System.out.println("How many words consist from 5 letters: " + countFive);

        int countE = 0;
        for (String i : wordsRandom) {
            if (i.contains("e"))
                countE++;
        }
        System.out.println("How many words contain 'e': " + countE);

        System.out.println("Are there any values which consist of the subString 'te': ");
        // TODO Should be one YES or NO

        for (String i : wordsRandom) {
            if (i.contains("te")) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
        //TODO Histogram...

        //printount ascending
        Collections.sort(wordsRandom);
        System.out.println("Words in ascending order: " + wordsRandom);
    }
}
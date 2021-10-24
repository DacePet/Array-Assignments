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

        startsC(wordsRandom);
        endsE(wordsRandom);
        fiveLetters(wordsRandom);
        countE(wordsRandom);
        checkTE(wordsRandom);
        System.out.println("HISTOGRAM MISSING");
        ascendingWords(wordsRandom);

    }


    public static void startsC(ArrayList<String> wordsRandom) {
        int countC = 0;
        for (String i : wordsRandom) {
            if (i.startsWith("C"))
                countC++;
        }
        System.out.println("How many words start with 'C': " + countC);
    }

    public static void endsE(ArrayList<String> wordsRandom) {
        int countEend = 0;
        for (String i : wordsRandom) {
            if (i.endsWith("e"))
                countEend++;
        }
        System.out.println("How many words end with 'e': " + countEend);
    }

    public static void fiveLetters(ArrayList<String> wordsRandom) {
        int countFive = 0;
        for (String i : wordsRandom) {
            if (i.length() == 5)
                countFive++;
        }
        System.out.println("How many words consist from 5 letters: " + countFive);
    }

    public static void countE(ArrayList<String> wordsRandom) {
        int countE = 0;
        for (String i : wordsRandom) {
            if (i.contains("e"))
                countE++;
        }
        System.out.println("How many words contain 'e': " + countE);
    }

    public static void checkTE(ArrayList<String> wordsRandom) {
        System.out.println("Are there any values which consist of the subString 'te': ");
        // TODO Should be one YES or NO

        for (String i : wordsRandom) {
            if (i.contains("te")) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
    //TODO Histogram...

    public static void ascendingWords(ArrayList<String> wordsRandom) {
        Collections.sort(wordsRandom);
        System.out.println("Words in ascending order: " + wordsRandom);
    }
}

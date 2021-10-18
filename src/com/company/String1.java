package com.company;

//import javax.swing.plaf.synth.SynthOptionPaneUI;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;


public class String1 {
    public static void main(String[] args) {
        String[] namesRandom = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};
        startsC(namesRandom); //done
        System.out.println();
        endsE(namesRandom); // done
        System.out.println();
        elementsFiveLetter(namesRandom); //done
        System.out.println();
        consistE(namesRandom); //done
        System.out.println();
        subStringTe(namesRandom); // done
        System.out.println();
        histogramOutput(namesRandom);
    }

    public static void startsC(String[] namesRandom) {
        System.out.println("How many values start with C: ");
        int counter = 0;
        for (int i = 0; i < namesRandom.length; i++)
            if (namesRandom[i].charAt(0) == 'C')
                counter++;
        {
            System.out.println(counter);
        }
    }

    public static void endsE(String[] namesRandom) {
        System.out.println("Values that end with 'e': ");
        int counter = 0;
        for (int i = 0; i < namesRandom.length; i++)
            if (namesRandom[i].endsWith("e"))
                counter++;
        {
            System.out.println(counter);
        }
    }

    public static void elementsFiveLetter(String[] namesRandom) {
        System.out.println("How many values are with lenght 5: ");
        int counter = 0;
        for (int i = 0; i < namesRandom.length; i++)
            if (namesRandom[i].length() == 5)
                counter++;
        {
            System.out.println(counter);
        }
    }

    public static void consistE(String[] namesRandom) {
        System.out.println("How many values consist of the character 'e': ");
        int counter = 0;
        for (int i = 0; i < namesRandom.length; i++)
            if (namesRandom[i].contains("e"))
                counter++;
        {
            System.out.println(counter);
        }
    }

    public static void subStringTe(String[] namesRandom) {
        System.out.println("Are there any values which consist of the subString 'te': ");
        int i = 0;
        if (namesRandom[i].contains("te"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void histogramOutput(String[] namesRandom) {
        System.out.println("...Method in progress...");
        // String output = "Element\tValueLength\tHistogram";
        //TODO Use SORTING whatever it means. bellow Edgars idea, but I dont understand.

        int arryNum[] = { 2, 3, 4, 5, 4, 4, 3, 6,7,8,9,10 };
        int[] counter = new int[] { 0, 0, 0, 0, 0,0,0,0,0,0 };
        for (int i = 0; i < arryNum.length; i++) {
            counter[arryNum[i]-1]++;
        }

        for (int i = 0; i < counter.length; i++)
            System.out.println((i + 1) + ":" + counter[i]);
        //tValue I replaced with tValueLength
        //for (int counter = 0; counter < namesRandom.length; counter++) {
        //  output += "\n" + counter + "\t" + namesRandom[counter] + "\t";
        //for (int stars = 0; stars < namesRandom [counter]; stars++) { //NEED Advise in this line
        //  output += "*";
        //}
        //}
        //System.out.println(output);
    }
}



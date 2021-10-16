package com.company;
//import java.nio.file.attribute.UserPrincipalNotFoundException;

import javax.swing.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String2 {
    public static void main(String[] args) {
        String sentence = "Climb mountains not so the world can see you, but so you can see the world.";
//1
        String arrName[] = sentence.split(" ");
        System.out.println("There are " + arrName.length + " words in the sentence.");

        //2
        int count = 0;
        for (int i = 0; i < arrName.length; i++)
            if (arrName[i].equals("the"))
                count++;
        System.out.println("There are " + count + " times used 'the' in the sentence.");

        //3
        int counter = 0;
        for (int i = 0; i < arrName.length; i++)
            if (arrName[i].contains("s"))
                counter++;
        System.out.println(counter + " words consist letter 's'.");

        //4.
        System.out.println("Multiple times used words in this sentence: ");
        System.out.println("Solution in progress");
//String findEquals =
//int i = 0;
//String regex = "Climb mountains not so the world can see you, but so you can see the world"
        for (String token : arrName) {
            String regex = token;
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(sentence);
            int count2 = 0;
            while (matcher.find()) {

                System.out.println(regex);
               // System.out.println("The word '" + regex + "' is used  " + count2 + " times.");

            }
        }
            //5.
            String replaceString = sentence.replace("you", "You");
            System.out.println(replaceString);
        }
    }
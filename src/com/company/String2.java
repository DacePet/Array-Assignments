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
        for (int i = 0;i < arrName.length; i++)
            if (arrName[i].contains("s"))
                counter++;
        System.out.println(counter + " words consist letter 's'.");

        //4.
        System.out.println("Multiple times used words in this sentence: ");
        System.out.println("Solution in progress");
        // int countcount = 0;
        //sentence = sentence.toLowerCase();
        //String wordsDublicates[] = sentence.split(" ");

             //int repeat = 0;
        //for (int i = 0; i<sentence.length(); i++) {
          //  for (int j = 0; j < sentence.length(); j++ ) {
            //    if(sentence.(i)==sentence.charAt(j))
              //  {
                //    repeat++;
                //}
            //}
            //System.out.println(sentence.charAt(i)+ "--" +repeat);
            //String d = String.valueOf(sentence(i)).trim();

            //repeat = 0;
        //}
        //for (int i = 0; i < arrName.length; i++) {
          //  countcount = 1;
            //for (int j = i + 1; j < arrName.length; j++) {
              //  if (arrName[i].equals(arrName[j])) {
                //    countcount++;
                  //  arrName[j] = "0";
               // }
               // if (countcount > 1 && arrName[i] != "0")
                 //   System.out.println(arrName[i]);
           // }
      //  }


//String findEquals =
        //int i = 0;
        //Pattern pattern = Pattern.compile(arrName[i]);
        //Matcher matcher = pattern.matcher(arrName[i]);
        ///boolean matchFound = matcher.find();
        //if (matchFound) {
        //  System.out.println("Found");
        //}else {
        //  System.out.println("No word is repeated multiple times in the sentence");

//        while (matcher.find())
        // System.out.println("Multiple: ");
        //int countcount = 0;
        //for (int i = 0; i < arrName.length; i++) {
        //  if (arrName[i].contentEquals()) {
        //    i++;
        //  countcount++;
        // System.out.println("Any result? " + i);
//            System.out.println("Word " + i + " is repeated " + countcount + " times in the sentence.");
        // System.out.println(sentence[i]);
        //TODO
        // int i = 0;


        // int i = 0;
//while (arrName[i[.co (StringBuffer arrName [i]);
//System.out.println("Words " + arrName[i] + " are repeated multiple times in the sentence.");
//StringBuilder builder = new StringBuilder(sentence);
        //  System.out.println(sentence.equals(builder));
        //System.out.println(sentence.contentEquals(builder));


        //5.
        String replaceString = sentence.replace("you", "You");
        System.out.println(replaceString);
    }
}

package com.company;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String2 {
    public static void main(String[] args) {
        String sentence = "Climb mountains not so the world can see you, but so you can see the world.";

        // QUESTION: if I havent [] in array line, I dont  undertand, how to call the String "sentence" in Method.
        //1.
        int numWords = (sentence.split("\\s+")).length;
        System.out.println("There are " + numWords + " words in the sentence.");

        //StringTokenizer text = new StringTokenizer("Climb mountains not so the world can see you, but so you can see the world");
        //System.out.println("How many words are in sentence: " + text.countTokens());
//2.
        Pattern pattern = Pattern.compile(" the ");
        Matcher matcher = pattern.matcher(sentence);
        int count = 0;
        while (matcher.find())
            count++;
        System.out.println("There are " + count + " times used 'the' in the sentence.");

//3.
        //int count = 0;
        //for (int i = 0; i < sentence.length(); i++)
        if (sentence.contains("s"))
            count++;
        {
            System.out.println(count + " words consist letter 's'."); //TODO Error, counts only until comma.
        }

        //4.
              // int i = 0;
        //Pattern pattern = Pattern.compile(sentence[i]);
        //Matcher matcher = pattern.matcher(sentence);

        //while (matcher.find())
          //  return multiple;
        System.out.println("Words XXX, YYY, ZZZ are repeated multiple times in the sentence.");
       // System.out.println(sentence[i]);
        //TODO
      // int i = 0;

        //}
//boolean contentEquals(StringBuffer sentence[i]);
//System.out.println("Words " + sentence[i] + " are repeated multiple times in the sentence.");
  //StringBuilder builder = new StringBuilder(sentence);
    //    System.out.println(sentence.equals(builder));
      //  System.out.println(sentence.contentEquals(builder));
        //5.
        String replaceString = sentence.replace("you", "You");
        System.out.println(replaceString);

    }
}

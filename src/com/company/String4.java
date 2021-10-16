package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class String4 {
    public enum Suit {SPADES, CLUBS, HEARTS, DIAMONDS}

    public enum Values {Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

    public static void main(String[] args) {


        for (Suit suit : Suit.values()) {
            for (Values values : Values.values())
                System.out.println(suit + " " + values);
            System.out.println();



        }
    }
    //public static void shuffle(){
      //  private static final List <Suit> CARDS = new ArrayList<>(Arrays.asList(Suit.values()))
        //Collections,shuffle(CARDS)
          //      return CARDS.remove(0);


}

package com.company;

import java.sql.Array;
import java.util.*;

public class String4 {
    public enum Suit {SPADES, CLUBS, HEARTS, DIAMONDS}

    public enum Values {Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace}

    public static void main(String[] args) {
        // cardsSet();
        System.out.println(Arrays.toString(cardsSet()));
        System.out.println();
        //  shuffleBySuit();
        System.out.println(shuffleBySuit());
    }

    public static String[] cardsSet() {
        int c = 0;
        String[] TheDeck = new String[52];
        for (Suit suit : Suit.values()) {
            for (Values val : Values.values()) {
                TheDeck[c] = suit.toString() + " " + val.toString();
                c++;
            }
        }
        return TheDeck;
    }

    public static List<String> shuffleBySuit() {
        List<String> shuffledCards = Arrays.asList(cardsSet());
        Collections.shuffle(shuffledCards);
        return shuffledCards;
    }
}







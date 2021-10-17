package com.company;

import java.sql.Array;
import java.util.*;

public class String4 {
    public enum Suit {SPADES, CLUBS, HEARTS, DIAMONDS}

    public enum Values {Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

    public static void main(String[] args) {

        for (Suit suit : Suit.values()) {
            for (Values values : Values.values())
                System.out.println(suit + " " + values);
            System.out.println();
        }

        List<Suit> shuffled = Arrays.asList(Suit.values());
        List<Values> shuffled2 = Arrays.asList(Values.values());
        Collections.shuffle(shuffled);
        Collections.shuffle(shuffled2);
        for (Suit msg : shuffled) {
            for (Values val : shuffled2) {
                System.out.println(msg + " " + val);
            }
        }
    }
}
//////////// version from https://docs.oracle.com/javase/8/docs/technotes/guides/language/enums.html
// also check https://www.coderscampus.com/enums/

// private final Suit suit;
//private final Values value;
//private String4 (Suit suit, Values value) {
//  this.suit = suit;
//this.value = value;
//  }

//public Suit suit() { return suit; }
//public Values value () { return value; }
//public String toString() { return value + " of " + suit; }

//  private static final List<String4> protoDeck = new ArrayList<String4>();

// Initialize prototype deck
//  static {
//    for (Suit suit : Suit.values())
//      for (Values val : Values.values())
//        protoDeck.add(new String4(suit, val));
//}

//public static ArrayList<String4> newDeck() {
//return new ArrayList<String4>(protoDeck); // Return copy of prototype deck
//}
//}



package com.company;

public class String4 {
    public enum Suit {SPADES, CLUBS, HEARTS, DIAMONDS}
    public enum Values {Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

    public static void main(String[] args) {
for (int i = 0; i<Suit.values().length; i++) {
    for (int j = 0; j < Values.values().length; j++)
        System.out.println(Suit.values() + " " + Values.values());
}
    }
}

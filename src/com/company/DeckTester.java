package com.company;

public class DeckTester {

    public static void main(String[] args) {
        String[] Rank = {"A", "B", "C"};
        String[] Suit = {"a", "b"};
        int[] points = {1,2,3};
        Deck x = new Deck(Rank,Suit,points);
        x.shuffle();
        while(!x.isEmpty())
        {
            System.out.println(x.deal());
        }
    }
}

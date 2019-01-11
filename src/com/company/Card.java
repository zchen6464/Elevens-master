package com.company;

public class Card
  {
    private String rank, suit;
    private int pointValue;
    
    public Card(String rank, String suit, int pointValue)
    {
      this.rank = rank;
      this.suit = suit;
      this.pointValue = pointValue;
    }
     
     public String getRank()
     {
      return this.rank;
     }
     
     public String getSuit()
     {
      return this.suit;
     }
     
     public int getValue()
     {
      return this.pointValue;
     }
     
     public boolean equals(Card otherCard)
     {
      return (this.pointValue == otherCard.pointValue);
     }
     
     public String toString()
     {
      return "Rank: " + this.rank + "\nSuit: " + this.suit + "\nPoint: " + this.pointValue;
     }
}

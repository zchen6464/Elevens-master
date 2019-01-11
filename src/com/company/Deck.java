package com.company;

import java.util.ArrayList;
import java.util.List;

public class Deck
{
  ArrayList<Card>Dealt = new ArrayList<> ();
  ArrayList<Card>unDealt = new ArrayList<> ();
  
  public Deck(String[] Rank, String[] Suit, int[] pointValue)
  {
    ArrayList<Card> x = new ArrayList<>();
    for(int i = 0; i < Suit.length; i ++)
    {
      for(int j = 0; j < Rank.length; j++)
      {
        Card temp= new Card(Rank[j],Suit[i],pointValue[j]);
        x.add(temp);
      }
    }
    this.unDealt = x;
  }
  
  public boolean isEmpty()
  {
    return (size() == 0);
  }
  
  public int size()
  {
    return unDealt.size();
  }
  public Card deal()
  {
    if(isEmpty())
    {
      return null;
    }
    int tempNum = (int)(Math.random() * unDealt.size()-1);
    Card tempVar = unDealt.get(tempNum);
    unDealt.remove(tempNum);
    Dealt.add(tempVar);
    return tempVar;
  }
  
  public void shuffle()
  {
    if(Dealt.size() != 0)
    {
      for(int i = 0; i < Dealt.size(); i++ )
      {
        unDealt.add(Dealt.get(i));
      }
    }
    for(int i = unDealt.size()-1; i >= 1; i--)
    {
      int x = (int)(Math.random() * i);
      Card tempVar = unDealt.get(x);
      unDealt.set(x,unDealt.get(i));
      unDealt.set(i,tempVar);
    }
  }
}

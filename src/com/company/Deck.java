package com.company;
import java.util.*;

public class Deck {
    public ArrayList<Card> list_of_cards;

    public Deck (ArrayList<Card> list_of_cards){
        this.list_of_cards = list_of_cards;
    }

    public void mix() {
        Collections.shuffle(this.list_of_cards, new Random());
    }

    private void  pullCard (Card card){
        list_of_cards.remove(card);
    }

    public Card pullFirstCard (){
        Card c = list_of_cards.get(0);
        list_of_cards.remove(c);
        return c;
    }
}

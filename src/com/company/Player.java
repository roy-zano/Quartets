package com.company;

import java.util.ArrayList;

public class Player {
    public  ArrayList<Card> list_of_cards;
    private String name;
    public ArrayList<Series> open_serieses;
    private boolean isActive;

    public Player (String name,ArrayList<Card> list_of_cards){
        this.name = name;
        this.list_of_cards = list_of_cards;
        this.open_serieses=new ArrayList<Series>();
    }

    public String getName() {
        return name;
    }

    private ArrayList<String> getMySerieses (){
        ArrayList<String> returnedList = new ArrayList<String>();
        for (Card c:this.list_of_cards){
            if (returnedList.contains(c.getSeries())==false){
                returnedList.add(c.getSeries());
            }
        }
        return returnedList;
    }

    private void  pushNewSeries (Card card_1, Card card_2, Card card_3, Card card_4){
        list_of_cards.remove(card_1);
        list_of_cards.remove(card_2);
        list_of_cards.remove(card_3);
        list_of_cards.remove(card_4);

        Series s = new Series( card_1, card_2, card_3, card_4);
        open_serieses.add(s);
    }

    public void  pushNewCrad (Card card){
        list_of_cards.add(card);
    }

    public void  pullNewCrad (Card card){
        list_of_cards.remove(card);
    }

    public boolean getActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

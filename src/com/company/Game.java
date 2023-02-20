package com.company;

import java.util.ArrayList;

public class Game {
    public ArrayList<Player> Players;
    private Deck deck;
    private String gameCode;

    public Game(ArrayList<Category>categories){
        //Bring all the cards from the list of categories from the database
        //create a unique code
        this.Players = new ArrayList<Player>();
    }

    public void addPlayer (Player p) {
        Players.add(p);
    }

    public void  Determining_the_active_player (Player player){
        for (Player p:this.Players) {
            p.setActive(false);
        }
        player.setActive(true);
    }

    public void pasCard (Player send, Player get, Card card){
        if (get.getActive() == true) {
            send.pullNewCrad(card);
            get.pushNewCrad(card);
        }
    }

    public void deelCards (){
        for (int i =0; i < 8; i++){
            for (Player p:this.Players) {
                p.pushNewCrad(deck.pullFirstCard());
            }
        }
    }
}

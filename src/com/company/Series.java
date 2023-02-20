package com.company;

public class Series {
    private Card card_1;
    private Card card_2;
    private Card card_3;
    private Card card_4;

    public Series (Card card_1, Card card_2, Card card_3, Card card_4){
        this.card_1 = card_1;
        this.card_2 = card_2;
        this.card_3 = card_3;
        this.card_4 = card_4;
    }

    public Card getCard_1() {
        return card_1;
    }

    public Card getCard_2() {
        return card_2;
    }

    public Card getCard_3() {
        return card_3;
    }

    public Card getCard_4() {
        return card_4;
    }

    public void setCard_1(Card card_1) {
        this.card_1 = card_1;
    }

    public void setCard_2(Card card_2) {
        this.card_2 = card_2;
    }

    public void setCard_3(Card card_3) {
        this.card_3 = card_3;
    }

    public void setCard_4(Card card_4) {
        this.card_4 = card_4;
    }
}

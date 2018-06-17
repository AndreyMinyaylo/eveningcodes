package com.eveningcodes.shop;

public class Payment {
    private String cards;

    public Payment(String cards) {
        this.cards = cards;
    }

    public String getCards() {
        return cards;
    }

    public void setCards(String cards) {
        this.cards = cards;
    }
}

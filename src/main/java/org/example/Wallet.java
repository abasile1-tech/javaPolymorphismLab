package org.example;

import java.util.ArrayList;

public class Wallet {
    private String name;

    private ArrayList<Card> cards;

    public Wallet(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.cards.size();
    }

    public void addItem(Card item) {
        this.cards.add(item);
    }
}

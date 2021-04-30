package project;

// This is where the patterns will be set up

// singleton
// criteria

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Card extends CardHandler{
    // instance variables
    private String cardName;
    private String suit;
    //private Image image;

    public Card(String cardName, String suit) {
        setCardName(cardName);
        setSuit(suit);
    }

    // list of valid card names
    public static List<String> getValidCardName(){
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }

    // list of valid suits
    public static List<String> getValidSuit(){
        return Arrays.asList("hearts", "spades", "diamonds", "clubs");
    }

    @Override
    public String getCardName() {
        return cardName;
    }

    // setting valid card names
    @Override
    public void setCardName(String cardName) {
        // calling a collection of valid card names
        List<String> validCardName = getValidCardName();
        cardName = cardName.toLowerCase();
        if(validCardName.contains(cardName))
            this.cardName = cardName;
        else {
            // throw exception when the wrong name is called
            throw new IllegalArgumentException("Illegal Name, legal names are: " + validCardName);
        }
    }

    // setting valid suit names
    @Override
    public void setSuit(String suit) {
        List<String> validSuit = getValidSuit();
        suit = suit.toLowerCase();
        if (validSuit.contains(suit))
        this.suit = suit;
        else
            throw new IllegalArgumentException("Illegal suit name, legal suits are: " + validSuit);
    }

    @Override
    public String getSuit() {
        return suit;
    }

    // this overrides the hex code hashing any object data I want to get from a list
    @Override
    public String toString(){
        return String.format("%s of %s", cardName, suit);
    }
}

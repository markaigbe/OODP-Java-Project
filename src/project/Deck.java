package project;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private ArrayList<Card> deck;
    //private Image backOfCard;

    // constructor to hold a list of cards from class card
    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    // constructor to build list of cards
    public Deck(){
        List<String> suits = Card.getValidSuit();
        List<String> cardNames = Card.getValidCardName();
        deck = new ArrayList<>();

        for(String suit:suits){
            for (String cardName:cardNames){
                deck.add(new Card(cardName,suit));
            }
        }
    }
}

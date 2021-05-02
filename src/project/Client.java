package project;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("Welcome to my java game application");
        System.out.println();

        // Testing Card Factory
        CardFactory cards = new CardFactory();
        CardInterface diamond = cards.getCard("Diamonds");
        diamond.print("");
        CardInterface heart = cards.getCard("Hearts");
        heart.print("");
        CardInterface spade = cards.getCard("spades");
        spade.print("");
        CardInterface club = cards.getCard("Clubs");
        club.print("");
    }
}

package project;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("Welcome to my java game application");
        System.out.println();

        // Testing Card Factory pattern
        CardFactory cards = new CardFactory();
        System.out.println("Factory Pattern test: ");
        CardInterface diamond = cards.getCard("Diamonds");
        diamond.print("");
        CardInterface heart = cards.getCard("Hearts");
        heart.print("");
        CardInterface spade = cards.getCard("spades");
        spade.print("");
        CardInterface club = cards.getCard("Clubs");
        club.print("");
        System.out.println();

        // Testing Template pattern
        System.out.println("Template Pattern test: ");
        Club template = new Club();
        template.groupMethods();

        // Testing Composite Pattern
        System.out.println();
        System.out.println("Composite Pattern test: ");
        Card card1 = new Card("Ace","Spades");
        Card card2 = new Card("2", "spades");
        Card card3 = new Card("3", "spades");
        Card card4 = new Card("4", "spades");
        Card card5 = new Card("5", "spades");
        Card card6 = new Card("6", "spades");
        Card card7 = new Card("7", "spades");
        Card card8 = new Card("8", "spades");
        Card card9 = new Card("9", "spades");
        Card card10 = new Card("10", "spades");
        Card card11 = new Card("Jack", "spades");
        Card card12 = new Card("Queen", "spades");
        Card card13 = new Card("King", "spades");

        card1.addCard(card2);
        card1.addCard(card3);
        card1.addCard(card4);
        card1.addCard(card5);
        card1.addCard(card6);
        card1.addCard(card7);
        card1.addCard(card8);
        card1.addCard(card9);
        card1.addCard(card10);
        card1.addCard(card11);
        card1.addCard(card12);
        card1.addCard(card13);

        System.out.println(card1);
        for(Card firstCard : card1.getCards()){
            System.out.println(firstCard);
        }
    }
}

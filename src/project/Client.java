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

        // Testing Singleton
        Gui gui = Gui.getGui();
    }
}

package project;

public class Client {
    public static void main(String[] args){

        System.out.println();
        System.out.println("Welcome to my java game application");

        // calling gui to main
        Gui gui = new Gui("Card Game");

        // testing methods + calling singleton object
        Card cardGame = Card.getCard();
        cardGame.print("Singleton pattern is working");
        System.out.println("-------------------");
        cardGame.setDiamonds(3);
        cardGame.checkCardType(cardGame.getDiamonds());
        cardGame.configureCardRank(cardGame.getDiamonds());
        System.out.println(cardGame.getAce());
        System.out.println("-------------------");


    }
}

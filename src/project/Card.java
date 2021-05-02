package project;

// This is where the patterns will be set up
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


class Card extends CardHandler{

    private String cardName;
    private String cardType;
    private List<Card> cards;
    public static ImageIcon image;

    public Card(String cardName, String cardType) {
        this.cardName = cardName;
        this.cardType = cardType;
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public void removeCard(Card card){
        cards.remove(card);
    }

    public List<Card> getCards(){
        return cards;
    }

    @Override
    public String toString(){
        return  cardName.toLowerCase() + "_of_" + cardType.toLowerCase();
    }
    // abstract methods
    @Override
    void suitName() {}

    public void buildDeck() {
        // Testing Composite Pattern

        System.out.println();
        System.out.println("Composite Pattern test: ");
        Card card1 = new Card("Ace", "Spades");
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
        Card card14 = new Card("Ace", "clubs");
        Card card15 = new Card("2", "clubs");
        Card card16 = new Card("3", "clubs");
        Card card17 = new Card("4", "clubs");
        Card card18 = new Card("5", "clubs");
        Card card19 = new Card("6", "clubs");
        Card card20 = new Card("7", "clubs");
        Card card21 = new Card("8", "clubs");
        Card card22 = new Card("9", "clubs");
        Card card23 = new Card("10", "clubs");
        Card card24 = new Card("Jack", "clubs");
        Card card25 = new Card("Queen", "clubs");
        Card card26 = new Card("King", "clubs");
        Card card27 = new Card("Ace", "hearts");
        Card card28 = new Card("2", "hearts");
        Card card29 = new Card("3", "hearts");
        Card card30 = new Card("4", "hearts");
        Card card31 = new Card("5", "hearts");
        Card card32 = new Card("6", "hearts");
        Card card33 = new Card("7", "hearts");
        Card card34 = new Card("8", "hearts");
        Card card35 = new Card("9", "hearts");
        Card card36 = new Card("10", "hearts");
        Card card37 = new Card("Jack", "hearts");
        Card card38 = new Card("Queen", "hearts");
        Card card39 = new Card("King", "hearts");
        Card card40 = new Card("Ace", "diamonds");
        Card card41 = new Card("2", "diamonds");
        Card card42 = new Card("3", "diamonds");
        Card card43 = new Card("4", "diamonds");
        Card card44 = new Card("5", "diamonds");
        Card card45 = new Card("6", "diamonds");
        Card card46 = new Card("7", "diamonds");
        Card card47 = new Card("8", "diamonds");
        Card card48 = new Card("9", "diamonds");
        Card card49 = new Card("10", "diamonds");
        Card card50 = new Card("Jack", "diamonds");
        Card card51 = new Card("Queen", "diamonds");
        Card card52 = new Card("King", "diamonds");

        if (cardName == card1.cardName){
            String fileName = "G:/OODP/src/images/" + cardName + "_of_" + cardType + ".png";
            image = new ImageIcon(fileName);
        }
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
        card1.addCard(card14);
        card1.addCard(card15);
        card1.addCard(card16);
        card1.addCard(card17);
        card1.addCard(card18);
        card1.addCard(card19);
        card1.addCard(card20);
        card1.addCard(card21);
        card1.addCard(card22);
        card1.addCard(card23);
        card1.addCard(card24);
        card1.addCard(card25);
        card1.addCard(card26);
        card1.addCard(card27);
        card1.addCard(card28);
        card1.addCard(card29);
        card1.addCard(card30);
        card1.addCard(card31);
        card1.addCard(card32);
        card1.addCard(card33);
        card1.addCard(card34);
        card1.addCard(card35);
        card1.addCard(card36);
        card1.addCard(card37);
        card1.addCard(card38);
        card1.addCard(card39);
        card1.addCard(card40);
        card1.addCard(card41);
        card1.addCard(card42);
        card1.addCard(card43);
        card1.addCard(card44);
        card1.addCard(card45);
        card1.addCard(card46);
        card1.addCard(card47);
        card1.addCard(card48);
        card1.addCard(card49);
        card1.addCard(card50);
        card1.addCard(card51);
        card1.addCard(card52);

        System.out.println(card1);
        for (Card firstCard : card1.getCards()) {
            System.out.println(firstCard);
        }
    }
}
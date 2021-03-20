package project;

// This is where the patterns will be set up

import java.util.ArrayList;

public class Cards {

    // instance variables
    private int diamonds;
    private int clubs;
    private int hearts;
    private int spades;
    private int[] rank = new int[13]; // 1 -> 13
    private ArrayList<Integer> deck = new ArrayList<Integer>();
    private int ace;
    private int jack;
    private int queen;
    private int king;

    // GENERATED
    public int getDiamonds() {
        return diamonds;
    }

    public void setDiamonds(int diamonds) {
        this.diamonds = diamonds;
    }

    public int getClubs() {
        return clubs;
    }

    public void setClubs(int clubs) {
        this.clubs = clubs;
    }

    public int getHearts() {
        return hearts;
    }

    public void setHearts(int hearts) {
        this.hearts = hearts;
    }

    public int getSpades() {
        return spades;
    }

    public void setSpades(int spades) {
        this.spades = spades;
    }

    public int getAce() {
        return ace;
    }

    public int getJack() {
        return jack;
    }

    public int getQueen() {
        return queen;
    }

    public int getKing() {
        return king;
    }

    public void configureCardRank(int card){
         for (int i=0; i<=rank.length-1; i++){
             rank[i] = i + 1;
             // creating local vars to store in a deck
             int diamondRank = rank[i];
             int heartRank = rank[i];
             int spadeRank = rank[i];
             int clubRank = rank[i];
             deck.add(diamondRank);
             deck.add(heartRank);
             deck.add(spadeRank);
             deck.add(clubRank);

             if(card == diamonds){
                 ace = rank[0];
                 jack = rank[10];
                 queen = rank[11];
                 king = rank[12];
                 //System.out.println("Diamond card Number " + diamondRank);
                 System.out.println("Full Deck: " + deck);
             }
             else if(card == hearts){
                 ace = rank[0];
                 jack = rank[10];
                 queen = rank[11];
                 king = rank[12];
                 System.out.println("Heart card Number " +heartRank);
             }
             else if(card == clubs){
                 ace = rank[0];
                 jack = rank[10];
                 queen = rank[11];
                 king = rank[12];
                 System.out.println("Club card Number " + clubRank);
             }
             else if(card == spades){
                 ace = rank[0];
                 jack = rank[10];
                 queen = rank[11];
                 king = rank[12];
                 System.out.println("Spade card Number " + spadeRank);
             }
             else{
                 System.out.println("Error with configure cards method");
             }
         }
    }

    // card type function works
    public void checkCardType(int card){
        if(card == diamonds){
           if (card > 0 && card <14) {
               // do something
                System.out.println("Card Type: Diamonds");
                System.out.println("Current Card Number: " + card);
           }
           else{
               System.out.println("Error with card number: must be between 1 and 13 inclusive");
           }
        }
        else if(card == clubs){
            if (card > 0 && card <14) {
                System.out.println("Card Type: Clubs");
                System.out.println("Card Number: " + card);
                System.out.println("-------------------");
            }
            else{
                System.out.println("Error with card number: must be between 1 and 13 inclusive");
            }
        }
        else if(card == spades){
            if (card > 0 && card <14) {
                System.out.println("Card Type: Spades");
                System.out.println("Card Number: " + card);
                System.out.println("-------------------");
            }
            else {
                System.out.println("Error with card number: must be between 1 and 13 inclusive");
            }
        }
        else if(card == hearts) {
            if (card > 0 && card <14) {
                System.out.println("Card Type: Hearts");
                System.out.println("Card Number: " + card);
                System.out.println("-------------------");
            }
            else {
                System.out.println("Error with card number: must be between 1 and 13 inclusive");
            }
        }
        else {
            System.out.println("Error with card type method");
        }
    }
}
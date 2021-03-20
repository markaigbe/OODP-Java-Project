package project;

// This is where the patters will be set up

public class Cards {
    private int diamonds;
    private int clubs;
    private int hearts;
    private int spades;
    private int deck = 52; // 52
    private int cardNum[]; // 1 -> 13
    private String cardType;
    // need a variable deck (52), rank (13), type (bool)


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

    public bool configureCards(){
         for (int i=0; i<cardNum.length; i++){
             cardNum[i] += cardNum[];
             System.out.println();
         }
    }

    public boolean checkCardType(){
        if(cardType = "diamonds"){
            // do something
            return "diamonds" + true;
        }
        else if(cardType = "clubs"){
            return "clubs" + true;
        }
        else if(cardType = "hearts"){
            return "hearts" + true;
        }
        else if(cardType = "spades"){
            return "spades" + true;
        }
        else {
            return false;
        }
    }
}

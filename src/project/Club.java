package project;

public class Club extends CardHandler implements CardInterface {

    private String cardName;
    private String cardType;

    public String getCardName() { return cardName; }
    public void setCardName(String cardName) { this.cardName = cardName; }

    public String getCardType() { return cardType; }
    public void setCardType(String cardType) { this.cardType = cardType; }

    // calling abstract functions
    public void suitName(){
        System.out.println("Suit Type = Club");
    }

    @Override
    public String toString() {
        return cardType + "_of_" + cardName;
    }

    // calling interface function
    @Override
    public void print(String message){
        message = "Diamonds";
        System.out.println("Card is: " + message);
    }
}

package project;

public class CardFactory {
    public CardInterface getCard(String card){
        if (card.equals(null)){ return null;}

        if(card.equalsIgnoreCase("Diamonds")){
            return new Diamond();
        }
        else if(card.equalsIgnoreCase("Hearts")){
            return new Heart();
        }
        else if(card.equalsIgnoreCase("Spades")){
            return new Spade();
        }
        else if(card.equalsIgnoreCase("Clubs")){
            return new Club();
        }

        return null;
    }
}
// to do
// create card classes, then link them using factory method then test all my methods
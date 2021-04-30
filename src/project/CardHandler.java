package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class CardHandler {

    // implementing template pattern
    abstract public String getCardName();

    abstract public void setCardName(String cardName);

    abstract public String getSuit();

    abstract public void setSuit(String suit);

    abstract public String toString();

    public final void groupMethods(){
        getCardName();
        setCardName("ace");
        getSuit();
        setSuit("spades");
        toString();
    }

}

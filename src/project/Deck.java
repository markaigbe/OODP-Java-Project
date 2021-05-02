package project;

import java.util.ArrayList;

abstract public class Deck {

    abstract public int getDiamonds();
    abstract public void setDiamonds(int diamonds);
    abstract public int getClubs();
    abstract public void setClubs(int clubs);
    abstract public int getHearts();
    abstract public void setHearts(int hearts);
    abstract public int getSpades();
    abstract public void setSpades(int spades);
    abstract public int getAce();
    abstract public int getJack();
    abstract public int getQueen();
    abstract public int getKing();

    abstract public String toString();

    public final void groupMethods(){
        getDiamonds();
        setDiamonds(0);
        getClubs();
        setClubs(0);
        getHearts();
        setHearts(0);
        getSpades();
        setSpades(0);
        getAce();
        getJack();
        getKing();
        getQueen();

        toString();
    }
}

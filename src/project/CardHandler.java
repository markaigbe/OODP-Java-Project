package project;

// Template Pattern
abstract public class CardHandler {

    abstract void suitName();
    abstract public String toString();

    public final void groupMethods(){
        toString();
        suitName();
    }
}

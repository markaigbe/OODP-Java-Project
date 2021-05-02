package project;

public class Spade implements CardInterface {
    public void print(String message){
        message = "Spades";
        System.out.println("Card is: " + message);
    }
}

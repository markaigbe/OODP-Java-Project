package project;

public class Diamond implements CardInterface{
    @Override
    public void print(String message){
        message = "Diamonds";
        System.out.println("Card is: " + message);
    }

}

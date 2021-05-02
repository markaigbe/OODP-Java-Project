package project;

public class Heart implements CardInterface{
    public void print(String message){
        message = "Hearts";
        System.out.println("Card is: " + message);
    }
}

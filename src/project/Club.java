package project;

public class Club implements CardInterface {
    public void print(String message){
        message = "Clubs";
        System.out.println("Card is: " + message);
    }
}

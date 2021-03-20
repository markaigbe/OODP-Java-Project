package project;

public class Client {
    public static void main(String[] args){

        System.out.println();
        System.out.println("Welcome to my java game application");

        //Gui gui1 = new Gui("Gui");

        // testing methods
        Cards c1 = new Cards();
        System.out.println("-------------------");
        c1.setDiamonds(3);
        c1.checkCardType(c1.getDiamonds());
        c1.configureCardRank(c1.getDiamonds());
        System.out.println(c1.getAce());
        System.out.println("-------------------");


    }
}

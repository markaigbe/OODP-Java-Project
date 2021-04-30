package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// gui class
//public class Gui extends JFrame implements ActionListener {

    /*/ // singleton pattern use
    private static Gui gui;

    private Gui(String title){
        Container c = getContentPane();

        JPanel panelOne = new JPanel();
        JPanel panelTwo = new JPanel();
        JPanel panelThree = new JPanel();
        JPanel panelFour = new JPanel();

        // call cards
        Card cardGame = Card.getCard();

        String[] artists = {"Taylor Swift", "Eminem", "SlopKnot", "AC-DC"};
        String[] b = {"Opel", "Ford", "Nissan", "Toyota"};
        String[] a = {"Taylor Swift", "Eminem", "SlopKnot", "AC-DC"};

        // creating my combo boxes and storing my arrays into them
        JOptionPane box1 = new JOptionPane(cardGame.configureCardRank(cardGame.getDiamonds()));
        JOptionPane box2 = new JOptionPane(artists);
        JOptionPane box3 = new JOptionPane(b);
        JOptionPane box4 = new JOptionPane(a);

        // i then add the boxes to my panels
        panelOne.add(box1);
        panelTwo.add(box2);
        panelThree.add(box3);
        panelFour.add(box4);

        // setting the artists list on the bottom(SOUTH), and the cars lists on the top (NORTH)
        c.add(panelOne, BorderLayout.NORTH);
        c.add(panelTwo, BorderLayout.SOUTH);
        c.add(panelThree, BorderLayout.EAST);
        c.add(panelFour, BorderLayout.WEST);


        setTitle(title);
        setSize(700,700);
        setVisible(true);
    }

    public static synchronized Gui getGui(){
        if(gui == null){
            gui = new Gui("Card Game");
        }
        return gui;
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }*/
//}

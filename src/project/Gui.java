package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// gui class
// singleton
public class Gui extends JFrame implements ActionListener {

    private static Gui gui;

    //image.
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JButton button;
    ImageIcon image1;
    ImageIcon image2;
    ImageIcon image3;
    JPanel panelOne;
    JPanel panelTwo;
    JPanel panelThree;
    Container c;

    private Gui() throws Exception {
        c = getContentPane();

        panelOne = new JPanel();
        panelTwo = new JPanel();
        panelThree = new JPanel();

        image1 = new ImageIcon("G:/OODP/src/images/2_of_clubs.png");
        image2 = new ImageIcon("G:/OODP/src/images/red_back.png");
        image3 = new ImageIcon("G:/OODP/src/images/3_of_spades.png");

        // creating my combo boxes and storing my arrays into them
        label1 = new JLabel(image1);
        label2 = new JLabel(image2);
        label3 = new JLabel(image3);
        button = new JButton("Shuffle");
        button.addActionListener(this);

        // i then add the boxes to my panels
        panelOne.add(button);
        panelTwo.add(label1);
        panelThree.add(label2);

        // setting the artists list on the bottom(SOUTH), and the cars lists on the top (NORTH)
        c.add(panelOne, BorderLayout.EAST);
        c.add(panelTwo, BorderLayout.CENTER);
        c.add(panelThree, BorderLayout.WEST);


        setTitle("Card Game");
        setSize(1920,1080);
        setVisible(true);
    }

    public static synchronized Gui getGui() throws Exception {
        if(gui == null){
            gui = new Gui();
        }
        return gui;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // next click
        ImageIcon nextImg = new ImageIcon("images/3_of_spades.png");
        label1 = new JLabel(nextImg);
        panelTwo.add(label1);
        c.add(panelTwo, BorderLayout.CENTER);

        //else
          //  System.out.println("Action method failed");
    }
}

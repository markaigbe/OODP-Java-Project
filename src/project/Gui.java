package project;

import javax.swing.*;
import java.awt.*;

// gui class
public class Gui extends JFrame {

    // constructor
    public Gui(String title) {
        Container c = getContentPane();

        JPanel panelOne = new JPanel();
        JPanel panelTwo = new JPanel();

        // creating and storing data in my arrays
        String[] carMake = {"Opel", "Ford", "Nissan", "Toyota"};
        String[] artists = {"Taylor Swift", "Eminem", "SlopKnot", "AC-DC"};

        // creating my comboboxes and storing my arrays into them
        JComboBox box1 = new JComboBox(carMake);
        JComboBox box2 = new JComboBox(artists);

        // i then add the boxes to my panels
        panelOne.add(box1);
        panelTwo.add(box2);

        // setting the artists list on the bottom(SOUTH), and the cars lists on the top (NORTH)
        c.add(panelOne, BorderLayout.NORTH);
        c.add(panelTwo, BorderLayout.SOUTH);


        setTitle(title);
        setSize(700,700);
        setVisible(true);
    }
}

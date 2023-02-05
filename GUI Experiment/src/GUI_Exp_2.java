// Set the layout of the frame using BorderLayout from java Awt.

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_Exp_2 {

    public GUI_Exp_2() {
        
        JFrame frame = new JFrame();

        // Get the screen size by using Dimenssion and Toolkit from java awt.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setResizable(true);

        JButton b_1 = new JButton("North");
        JButton b_2 = new JButton("South");
        JButton b_3 = new JButton("East");
        JButton b_4 = new JButton("West");
        JButton b_5 = new JButton("Center");

        // Set the border layout by using direction
        frame.setLayout(new BorderLayout(15,20));
        frame.add(b_1,BorderLayout.NORTH);
        frame.add(b_2,BorderLayout.SOUTH);
        frame.add(b_3,BorderLayout.EAST);
        frame.add(b_4,BorderLayout.WEST);
        frame.add(b_5,BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        
        new GUI_Exp_2();
    }
}

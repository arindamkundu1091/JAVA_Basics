// Set the layout of the frame using GridLayoutr from java Awt.

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_Exp_3 {

    public GUI_Exp_3() {
        
        JFrame frame = new JFrame();

        // Get the screen size by using Dimenssion and Toolkit from java awt.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setResizable(true);

        JButton b_1 = new JButton("Buttom_1");
        JButton b_2 = new JButton("Buttom_2");
        JButton b_3 = new JButton("Buttom_3");
        JButton b_4 = new JButton("Buttom_4");
        JButton b_5 = new JButton("Buttom_5");
        JButton b_6 = new JButton("Buttom_6");

        // Set the border layout by using Grid
        frame.add(b_1);
        frame.add(b_2);
        frame.add(b_3);
        frame.add(b_4);
        frame.add(b_5);
        frame.add(b_6);
        
        frame.setLayout(new GridLayout(3,3,15,20));

        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        
        new GUI_Exp_3();
    }
}

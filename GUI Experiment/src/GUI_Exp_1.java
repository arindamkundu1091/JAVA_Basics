// Set frame to full screen width and height.

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GUI_Exp_1 {

    public GUI_Exp_1() {
        
        JFrame frame = new JFrame();

        // Get the screen size by using Dimenssion and Toolkit from java awt.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setResizable(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        
        new GUI_Exp_1();
    }
}

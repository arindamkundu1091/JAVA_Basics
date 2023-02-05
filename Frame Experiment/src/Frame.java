import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {
    public static JPanel panel = new JPanel();
    public static void main(String[] args) throws UserDefinedException {
        FirstPanel fp = new FirstPanel();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,650);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        panel.setSize(700,650);
        frame.add(panel);

        JButton button = new JButton("FP");
        button.setBounds(10,10,100,25);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.invalidate();
                frame.revalidate();
                frame.repaint();
                // int width = fp.getWidth();
                // int height = fp.getHeight();
                // frame.setSize(width, height);
                frame.add(new FirstPanel());
                frame.setVisible(true);
            }
        });
        panel.add(button);


        frame.setVisible(true);
        throw new UserDefinedException();
    }
}
class UserDefinedException extends Exception {

    public UserDefinedException() {}
    
}
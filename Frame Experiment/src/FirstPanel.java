import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstPanel extends JPanel {
    
    Frame frame = new Frame();
    private int width = 350;
    private int height = 300;
    JLabel label = new JLabel("First Panel");
    JButton button = new JButton("Home");
    
    public FirstPanel() {
        setSize(width, height);
        setBackground(Color.LIGHT_GRAY);

        label.setBounds(10,10,200,25);
        add(label);

        button.setBounds(50,100,100,25);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                remove(new FirstPanel());
                invalidate();
                revalidate();
                repaint();
                add(Frame.panel);
            }
            
        });
        add(button);
    }

    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
}

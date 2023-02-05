import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUILogIn implements ActionListener {

    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton logInButton;
    private static JButton cancelButton;
    private static JLabel success;
    
    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);
        
        userlabel = new JLabel("User");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);
        
        userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);
    
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);
    
        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);
    
        logInButton = new JButton("Log In");
        logInButton.setBounds(140,100,80,25);
        logInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        
                String user = userText.getText();
                String password = passwordText.getText();
                System.out.println(user+" - "+password);
        
                if(user.equals("Arindam") && password.equals("arin1091")) {
                    success.setText("Log In succeccful !");
                    System.out.println(user+" - "+password);
                }
                else {
                    success.setText("Enter valid user name or password");
                }
            }
        });
        panel.add(logInButton);
    
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(50,100,80,25);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(cancelButton);
    
        success = new JLabel();
        success.setBounds(10,150,300,25);
        panel.add(success);

        frame.setVisible(true);
 
    }
}

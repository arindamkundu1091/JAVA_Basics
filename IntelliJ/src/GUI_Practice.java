import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Practice {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(400,500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Log In");

        panel.setBackground(Color.cyan);

        frame.add(panel);

        panel.setLayout(null);

        JLabel User = new JLabel("User Name:");
        User.setBounds(10,100,80,30);
        panel.add(User);

        JTextField UserText = new JTextField();
        UserText.setBounds(100,100,200,30);
        panel.add(UserText);

        JLabel Password = new JLabel("Password:");
        Password.setBounds(10,150,80,30);
        panel.add(Password);

        JPasswordField PasswordText = new JPasswordField();
        PasswordText.setBounds(100,150,200,30);
        panel.add(PasswordText);

        JLabel success = new JLabel();
        success.setBounds(10,220,300,25);
        panel.add(success);

        JButton LogIn = new JButton("Log In");
        LogIn.setBounds(100,190,80,30);
        LogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String setUser = "Arindam1091";
                String setPass = "Arindam#1";
                String user = UserText.getText();
                String password = PasswordText.getText();
                System.out.println(user + " - " + password);

                if (user.equals(setUser) && password.equals(setPass)) {
                    success.setText("Log In succeccful !");
                    System.out.println(user + " - " + password);
                } else {
                    success.setText("Enter valid user name or password");
                }
            }
        });
        panel.add(LogIn);

        JButton Cancel = new JButton("Cancel");
        Cancel.setBounds(200,190,80,30);
        Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(Cancel);

        frame.setVisible(true);
    }
}

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class LogIn{
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(400,500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel User = new JLabel("User");
        User.setBounds(10,100,80,30);
        panel.add(User);

        JTextField UserText = new JTextField();
        UserText.setBounds(100,100,200,30);
        panel.add(UserText);

        JLabel Password = new JLabel("Password");
        Password.setBounds(10,150,80,30);
        panel.add(Password);

        frame.setVisible(true);
    }
}

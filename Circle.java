
import java.util.Scanner;
public class Circle
{
    float r,p = (float) 3.14159;

    Circle(float x)
    {
        r = x;
    }
    void area()
    {
        float a = p*r*r;
        System.out.println("Area of the circle is: "+a);
    }
    void dia()
    {
        float d = 2*p*r;
        System.out.println("Diameter of the circle is: "+d);
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the radius of the circle:  ");
        Scanner sc = new Scanner(System.in);
        float i = sc.nextFloat();
        Circle c=new Circle(i);
        c.area();
        c.dia();
    }

    public static class GUI implements ActionListener {

        private int count = 0;
        private JLabel label;
        private JFrame frame;
        private JPanel panel;
        private JButton button;

        public GUI() {

            frame = new JFrame();

            button = new JButton("Click me");
            button.addActionListener(this);

            label= new JLabel("Number of Clicks: 0");

            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
            panel.setLayout(new GridLayout(0,1));
            panel.add(button);
            panel.add(label);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Our Circle.GUI");
            frame.pack();
            frame.setVisible(true);

        }

        public static void main(String[] args) {

            new GUI();
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            count++;
            label.setText("Number of clicks: "+count);
        }
    }
}

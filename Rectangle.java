import java.util.Scanner;

public class Rectangle {
    float l, b;

    Rectangle(float x, float y) {
        l = x;
        b = y;
    }

    void area() {
        float a = l * b;
        System.out.println("Area of the rectangle is: " + a);
    }

    void peri() {
        float p = 2 * (l + b);
        System.out.println("Perimeter of the rectangle is: " + p);
    }

    public static void main(String[] args) {
        System.out.print("Enter length and Breadth: ");
        Scanner p = new Scanner(System.in);
        float i = p.nextFloat();
        float j = p.nextFloat();
        Rectangle r = new Rectangle(i, j);
        r.area();
        r.peri();
    }
}


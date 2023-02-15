import java.util.Scanner;

class Shape{
    double area;
    public void computeArea(){
        area = 0;
    }
}

class Circle extends Shape {
    double r;
    public void computeArea(){
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        area = (3.14*r*r);
        System.out.printf("%.2f",area);
        sc.close();
    }
}

class Rectangle extends Shape{
    double l;
    double b;
    public void computeArea(){
        Scanner sc = new Scanner(System.in);
        l = sc.nextDouble();
        b = sc.nextDouble();
        area = (l*b);
        System.out.printf("%.2f",area);
        sc.close();
    }
}

class Triangle extends Shape{
    double b;
    double h;
    public void computeArea(){
        Scanner sc = new Scanner(System.in);
        b = sc.nextDouble();
        h = sc.nextDouble();
        area = (0.5*b*h);
        System.out.printf("%.2f",area);
        sc.close();
    }
}

class Area{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Shape cir = new Circle();
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        switch(t){
            case 1: cir.computeArea();
                break;
            case 2: rect.computeArea();
                break;
            case 3: tri.computeArea();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}
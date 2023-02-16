
//Inheritance Q.5
import java.util.Scanner;

class Shape{
    Double area;
    public void computeArea(){
        area = 0.00;
    }
}

class Circle extends Shape{
    Double r;
    Circle(Double r){
        this.r = r;
    }
    public void computeArea(){
        area = (3.14*r*r);
        System.out.printf("%.2f",area);
    }
}

class Rectangle extends Shape{
    Double l;
    Double b;
    Rectangle(Double l, Double b){
        this.l = l;
        this.b = b;
    }
    public void computeArea(){
        area = (l*b);
        System.out.printf("%.2f",area);
    }
}

class Triangle extends Shape{
    Double b;
    Double h;
    Triangle(Double b, Double h){
        this.b = b;
        this.h = h;
    }
    public void computeArea(){
        area = (0.5*b*h);
        System.out.printf("%.2f",area);
    }
}

class Area_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer t = sc.nextInt();
        switch(t){
            case 1: {
                Double r = sc.nextDouble();
                Circle cir = new Circle(r);
                cir.computeArea();
                
            }
                break;
            case 3: {
                Double b = sc.nextDouble();
                Double h = sc.nextDouble();
                Triangle tri = new Triangle(b, h);
                tri.computeArea();
                
            }
                break;
            case 2: {
                Double l = sc.nextDouble();
                Double b = sc.nextDouble();
                Rectangle rect = new Rectangle(l,b);
                rect.computeArea();
                
            }
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}
public class Ques_65{
    static double area;
    int b = 2, h = 3;
    public static void main(String[] args) {
        double p, b, h;
        if (area == 0) {
            b = 3;
            h = 4;
            p = 0.5;
        }
        area = p * b * h;
        System.out.println("Area of triangle is: " + area);
    }
}

//! output:- compilation fails at line 11.
//? explaination:- 
                    //* The local variable p may not have been initialized
                    //* The local variable b may not have been initialized
                    //* The local variable h may not have been initialized
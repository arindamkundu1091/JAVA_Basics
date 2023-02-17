
import java.util.Scanner;

interface i{
    int value = 10;
    void display(String s);
}

class Ques_2 implements i {
    public void display(String s){
        System.out.println(s);
        System.out.print(value);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Ques_2 p = new Ques_2();
        p.display(str);
        sc.close();
    }
}
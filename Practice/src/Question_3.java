import java.util.Scanner;
public class Question_3 {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(s[0]);
        if(input%4 == 0) {
            System.out.print("LEAP YEAR");
        }
        else {
            System.out.print("NOT LEAP YEAR");
        }
        
    }    
}

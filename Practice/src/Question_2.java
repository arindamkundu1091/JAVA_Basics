import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        if(n%2 == 1) {
            result = n-1;
            System.out.println(result);
        }
        else {
            result = (n/2)-1;
            System.out.println(result);
        }
    }
}

import java.util.Scanner;

public class Ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        s1 = s1.replaceAll(s2,s3);
        System.out.print("replaced string: "+s1);

    }
}

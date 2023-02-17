import java.util.Scanner;

public class Ques_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);
        System.out.println(sorted);

    }
}

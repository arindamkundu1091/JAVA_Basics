import java.util.Scanner;

public class Ques_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder input = new StringBuilder();
        input.append(s);
        input.reverse();
        System.out.print(input);

    }
}

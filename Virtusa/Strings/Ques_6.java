import java.util.Scanner;

public class Ques_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "";
        boolean check = true;
        while (check) {
            String input = sc.nextLine();
            if (input.equals("q"))
                check = false;
            line = line + input + "\n";
        }
        String str[] = line.split("\n");
        System.out.print(str.length - 1);
    }
}

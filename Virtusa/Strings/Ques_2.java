import java.util.Scanner;

public class Ques_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String Line = sc.nextLine();
        String newLine = Line.trim().replaceAll(" +"," ");
        System.out.print(newLine);

    }
}

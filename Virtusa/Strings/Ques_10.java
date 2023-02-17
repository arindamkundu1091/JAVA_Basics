import java.util.Scanner;

public class Ques_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        int n = x.length();
        String z = "";
        for(int i = 0; i<n; i++){
            char it;
            if(x.charAt(i) == y.charAt(i)){
                if(x.charAt(i) == 'W')
                    z += 'B';
                    else if(x.charAt(i) == 'B')
                        z += 'W';
            } else{
                z += 'B';
            }
        }
        System.out.print(z);
    }
}

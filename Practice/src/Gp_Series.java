import java.util.Scanner;
public class Gp_Series {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a = 1;
            if(n%2 == 1) {
                int r1 = 2;
                int n_term = (n+1)/2;
                int result =(int) ((int) a*(Math.pow(r1,n_term-1)));
                System.out.println(result);
            }
            else {
                int r2 = 3;
                int n_term1 = n/2;
                int result =(int) ((int) a*(Math.pow(r2,n_term1-1)));
                System.out.println(result);
            }  
    }
}

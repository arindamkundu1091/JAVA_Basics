import java.util.Scanner;

public class Factorials
{

    static void fact(long j)
    {
        long i ,  k ;
        if(j<=20)
        {
            for (i = 1; i <= j; i++)
            {
                for (k = 1; k <=j; k++)
                {
                    i = i * k;
                    System.out.println(k+"!  = "+i);
                }
                System.out.println("Factorial of "+j+" is: "+i);
            }
        }
        else
        {
            System.out.println("Error! (Factorial of "+j+" is huge)");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        long b = sc.nextLong();
        fact(b);
    }
}



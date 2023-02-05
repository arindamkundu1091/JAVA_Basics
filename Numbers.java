import java.util.Scanner;

abstract class Numbers
{
    static int Prime(int n)
    {
        if(n<=1)

            return 0;
        
        for(int i = 2;i<n;i++)
            
        if(n%i == 0)

            return 0;
            
            return 1;
    }

    abstract void checkPrime(int n);

    static int Emirp(int n)
    {
        int reverse,remainder;

        if (Prime(n) == 0)

            return 0;
        
        reverse = 0;

        while(n != 0)
        {
            remainder = n % 10;
            reverse = remainder + reverse*10;
            n = n/10;
        }    
        System.out.println("The reverse number is: "+reverse);
            
        if(Prime(reverse) == 0)

            return 0;

            return 1;
    }

    abstract void checkEmirp(int n);

    static boolean fascinating(int n)
    {
        int n2 = 2 * n;
        int n3 = 3 * n;

        String str = ""+n+n2+n3;

        boolean check =true;

        for(char num = '1';num<='9';num++)
        {
            int times = 0;

            for(int i = 0;i < str.length();i++)
            {
                char ch = str.charAt(i);

                if(num == ch)
                {
                    times++;
                }
            }
            
            if(times != 1)
            {
            check = false;
            return false;
            }
        }
        if( check ==true)
        {
            return true;
        }
        else
        {
           return false; 
        }  
    }
    
    abstract void checkFascinating(int n);

    static int polydivisible(int input)
    {
        int i = 0;
        int n = 0;
        int divisor = 0;
        int remainder = 0;
        int content = input;
        
        while(input > 9)
        {
            input = input / 10;
            n++;
        }

        divisor = n + 1;
        int arr[] = new int[n+1];

        while(i < (n+1))
        {
            arr[i] = content;
            content = content/10;
            remainder = arr[i] % divisor;

            i++;
            divisor--;

            if(remainder != 0)
            break;
        }
        if(remainder != 0)

            return 0;

            return 1;
    }
    
    abstract void checkPolydivisible(int n);
}
class Run extends Numbers
{
    void checkPrime(int input)
    {
        if (Prime(input) == 1)
            System.out.println(input+" is Prime number.");
        else
            System.out.println(input+" is not Prime number.");
    }

    void checkEmirp(int input) 
    {
        if (Prime(input) == 1)
            System.out.println(input + " is Emirp number.");
        else
            System.out.println(input + " is not Emirp number.");
    }

    void checkFascinating(int input) 
    {
        if (fascinating(input) == true)
            System.out.println(input + " is fascinating number.");
        else
            System.out.println(input + " is not fascinating number.");
    }

    void checkPolydivisible(int input) 
    {
        if (polydivisible(input) == 0)
        {
            System.out.println(input + " is not Polydivisible number");
        }  
        else
        {
            System.out.println(input + " is Polydivisible number");
        }
    }
    public static void main(String[] args) 
    {
        Run runner  = new Run();
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter a number to check: ");
            int number = sc.nextInt();
            
            runner.checkPrime(number);
            runner.checkEmirp(number);
            runner.checkFascinating(number);
            runner.checkPolydivisible(number);
        }
    }
}
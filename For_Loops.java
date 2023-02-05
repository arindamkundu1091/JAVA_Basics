public class For_Loops
{
    public static void main(String[] args)
    {
           //int a = 10;
           // b = a++ + a++ + a++;
           // System.out.println(b);
           //System.out.println(a);


           //        Scanner s = new Scanner(System.in);
           //        int a, b, c,i;
           //        System.out.println("Enter the number for which multipilication table you want to see:");
           //        a = s.nextInt();
           //            for(i=1;i<=10;i++)
           //                {if(a<=9){
           //                     System.out.print(a+"   ");
           //                }else
           //                     System.out.print(a+"  ");
           //                }
           //                     System.out.println("");
           //            for (b = 1; b <= 10; b++) {
           //                      c = b * a;
           //                if(b<=9){
           //                     System.out.print(b+"   ");
           //                }else
           //                     System.out.print(b+"  ");
           //                }
           //                     System.out.println("");
           //            for (b = 1; b <= 10; b++) {
           //                 c = b * a;
           //                if(c<=9){
           //                     System.out.print(c+"   ");
           //                }else
           //                if(c<=99){
           //                     System.out.print(c+"  ");
           //                }
           //                else System.out.print(c+" ");
           //                }
           //        }
           //    }


           // From lower to upper
           //        int a, b;
           //        for (a = 5; a >= 1; a--) {
           //            System.out.println(" ");
           //            for (b = a; b <= 5; b++) {
           //                System.out.print(" * ");
           //            }
           //        }



           //from upper to lower
           //        int x, y;
           //        for (x = 1; x <= 5; x++) {
           //            System.out.println(" ");
           //            for (y = x; y <= 5; y++) {
           //                System.out.print(" * ");
           //            }
           //        }



           //      System.out.println("Hello World");
           //        Scanner sc = new Scanner(System.in);
           //        int b = 9;
           //        System.out.print("Enter the binary number of ");
           //        System.out.println(b);
           //        int a = sc.nextInt();
           //        if (a == 1001) {
           //            System.out.print("Yes, You are correct ");
           //            System.out.print(a);
           //            System.out.print(" is the binary number of ");
           //            System.out.print(b);
           //
           //        } else {
           //            System.out.println("Sorry, But you are wrong.");
           //        }



           
                              int i, j, k, l, m;
                          for (i = 1; i <= 5; i++)
                      {
                          for (j = 5; j >= i; j--)
                              System.out.print(" ");
                          for (k = 1; k <= i; k++)
                              System.out.print("*");
                          for (l = 1; l <= i; l++)
                              System.out.print("*");
                          for (m = 4; m >= i; m--)
                              System.out.print(" ");
                          for (k = 1; k <= i; k++)
                             System.out.print("*");
                         for (l = 1; l <= i; l++)
                             System.out.print("*");
                             System.out.println("");
                    }
                         for (i = 10; i >= 1; i--)
                    {
                         for (j = 10; j >= i; j--)
                             System.out.print(" ");
                         for (l = 1; l <= i; l++)
                             System.out.print("*");
                         for (m = i; m >= 2; m--)
                             System.out.print("*");
                             System.out.println("");
                     }
                     System.out.println("---------LOVE---------");

    }
}

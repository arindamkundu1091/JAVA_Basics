import java.util.Scanner;
class Practice {
        public static void main(String args[]) {
                Scanner scan = new Scanner(System.in);
                // System.out.println("Hello world");
                // for(int i = 0; i <= 5; i++) {
                //         System.out.println("Hi, I am arindam");
                // }
                System.out.println();
                System.out.println("Enter  your name: ");
                String intro = scan.nextLine();
                int len = intro.length();
                 for(int i = 0; i< len; i++) {
                        char ch = intro.charAt(i);
                //         if(65<=ch && ch<=90 || 97<=ch && ch<=122) {
                //                 char charray[] = new char[len];
                //                 charray[i] = ch;
                //                 System.out.print(ch);
                //         }
                        while(65<=ch && ch<=90 || 97<=ch && ch<=122) {
                                System.out.print(ch);
                                break;
                        }
                }
                //System.out.println(intro);

        }
}
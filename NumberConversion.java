import java.util.*;
import java.io.*;

class NumberConversion
{
    static String decimalToBinary()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal to convert binary: ");
        int number = sc.nextInt();
        int index = 50;
        String string;
        int binary[] = new int[index];
        StringBuilder builder = new StringBuilder();

        while(number > 0)
        {
            binary[index-1] = number % 2;
            index--;
            number = number/2;
        }
        // for(int i = index-1; i<binary.length; i++)
        // {
        //     System.out.print(binary[i]);
        // }
        System.out.println("");
        for(int i:binary)
        {
            builder.append(i);
        }
        string = builder.toString();

        return string;
    } 

    static int binaryToDecimal()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary convert to decimal: ");
        String input = sc.nextLine();
        int decimal = 0;
        double result = 0;
        int number = 0, power = 0, ch = 0;

        for(int i = input.length()-1; i>=0; i--)
        {
            ch = input.charAt(i);
            if (ch > 49) {
                System.out.println("invalid input.....");
                break;
            }
            number = (input.charAt(i)-48);
            result = result + (Math.pow(2,power)*number);
            power++;
        }
        decimal = (int)result;

        return decimal;
    }

    static String decimalToOctal() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal to convert octal: ");
        int number = sc.nextInt();
        int index = 25;
        String string;
        int octal[] = new int[index];
        StringBuilder builder = new StringBuilder();

        while (number > 0) {
            octal[index - 1] = number % 8;
            index--;
            number = number / 8;
        }
        // for(int i = index-1; i<octal.length; i++)
        // {
        // System.out.print(octal[i]);
        // }
        System.out.println("");
        for (int i : octal) {
            builder.append(i);
        }
        string = builder.toString();

        return string;
    }

    static int octalToDecimal() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal to convert decimal: ");
        String input = sc.nextLine();
        int decimal = 0;
        double result = 0;
        int number = 0, power = 0, ch = 0;

        for (int i = input.length() - 1; i >= 0; i--) 
        {
            ch = input.charAt(i);
            if(ch > 55)
            {
                System.out.println("invalid input.....");
                break;
            }
            number = (ch - 48);
            result = result + (Math.pow(8, power) * number);
            power++;
        }
        decimal = (int) result;

        return decimal;
    }

    static String decimalToHexadecimal()
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int remainder = 0, index = 15;
        String result = "";
        char[] hexadecimal,hexch = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        hexadecimal = new char[16];

        while(input>0)
        {
            remainder = input % 16;
            hexadecimal[index] = hexch[remainder];
            input = input/16;
            index--;
        }
        for(int i = index; i<hexadecimal.length;i++)
        {
            result = result+""+hexadecimal[i];
        }
        return result;
    }

    static int hexadecimalToDecimal()
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int index = 0, result = 0, power = 0;
        double ans = 0.0;
        String hexcode = "0123456789ABCDEF";
        input = input.toUpperCase();

        for(int i = input.length()-1; i>=0; i--)
        {
            index = hexcode.indexOf(input.charAt(i));
            ans = ans + (Math.pow(16,power)*index);
            power++;
        }
        result = (int)ans;
        return result;
    }

    public static void main(String[] args) 
    {
        // System.out.println(decimalToBinary());
        // System.out.println(binaryToDecimal());
        

        // System.out.println(decimalToOctal());
        // System.out.println(octalToDecimal());

        // System.out.println(decimalToHexadecimal());
        // System.out.println(hexadecimalToDecimal());
    }
}

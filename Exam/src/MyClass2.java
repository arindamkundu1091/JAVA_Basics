import java.util.Scanner;

class MyClass2 {

    public static boolean check(String input){
        boolean check = false;
        for(int i = 0; i < input.length()-1; i++) {
            char ch1 = input.charAt(i);
            char ch2 = input.charAt(i+1);
            if(ch1 == ch2){
                check = true;
                break;
            }
        }
        if(check == true)
        return true;
        return false;
    }

    public static String operation(String input) {
        String result = "";
        if (check(input) == true){
            for(int i = 0; i <input.length()-1; i++) {
                char ch1 = input.charAt(i);
                char ch2 = input.charAt(i+1);
                if(ch1 == ch2){
                    continue;
                }
                result = result + ch1 +ch2;
            }
            if(check(result) == true)
            operation(result,r);
            return result;
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        System.out.println(operation(input));
        
    }
}
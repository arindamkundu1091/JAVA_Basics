public class Question_4 {
    public static void main(String[] s) {
        int num1 = Integer.parseInt(s[0]);
        int num2 = Integer.parseInt(s[1]);

        int small = num1>num2 ? num2:num1;
        int result = 1;
        for(int i = small; i>=1; i--) {
            if((num1%i == 0)&(num2%i == 0)) {
               result = i;
                break;
            }
        }
        System.out.println(result);
    }
}

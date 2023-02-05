public class Question_5 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        boolean check = true;

        for(int i = 2; i<number; i++) {
            if(number % i == 0 ) {
                check = false;
                break;
            }
        }
        if(check == true) {
            System.out.printf("%.2f", Math.sqrt(number));
        }
        else {
            System.out.print("0.00");
        }
    }
}

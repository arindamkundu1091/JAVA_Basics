import java.util.Scanner;

interface Growing {
    void isGrowing();
}

class GrowingNumber implements Growing {
    int num;
    GrowingNumber(int num) {
        this.num = num;
    }
    public void isGrowing() {
        boolean check = false;
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) < numStr.charAt(i + 1)) {
                check = true;
            } else {
                check = false;
            }
        }
        if (check) {
            System.out.println("Growing number");
        } else {
            System.out.println("Not growing number");
        }
    }
}

class GrowingString implements Growing {
    String str;
    GrowingString(String str) {
        this.str = str;
    }
    public void isGrowing() {
        String newStr = str.toUpperCase();
        boolean check = false;
        for (int i = 0; i < newStr.length() - 1; i++) {
            if (newStr.charAt(i) < newStr.charAt(i + 1)) {
                check = true;
            } else {
                check = false;
            }
        }
        if (check) {
            System.out.println("Growing string");
        } else {
            System.out.println("Not growing string");
        }
    }
}


public class Ques_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        GrowingNumber gn = new GrowingNumber(num);
        gn.isGrowing();
        GrowingString gs = new GrowingString(str);
        gs.isGrowing();
        sc.close();
    }
}

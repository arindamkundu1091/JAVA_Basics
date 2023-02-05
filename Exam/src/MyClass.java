import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int fn = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[0] == arr[i]) {
                fn = fn + arr[i];
                index++;
                break;
            } else {
                fn = arr[i] + fn;
                index++;
            }
        }

        if (index + k > arr.length) {
            System.out.print(fn);
        } else {
            int temp = 0;
            index = index + k;
            for (int i = index + 1; i < arr.length; i++) {
                if (temp <= arr[i]) {
                    temp = arr[i];
                }
            }
            fn = fn + temp;
            System.out.print(fn);
        }
        sc.close();
    }
}

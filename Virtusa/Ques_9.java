import java.util.Scanner;

interface i{
    void leftRotate(int arr[],int d,int n);
    void leftRotatebyOne(int arr[],int n);
    void printArray(int arr[],int n);
}

class Ques_9 implements i {
    
    public void printArray(int arr[], int n) {
        for (int i : arr) {
            n--;
            System.out.print(i);
            if (n == 0) {
                break;
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public void leftRotate(int arr[], int d, int n) {
        // int newarr[] = new int[arr.length];
        // int len = n;
        // for(int k = 0; k < d; k++){
        //     newarr[len-1] = arr[0];
        //     for (int i = 0; i < len - 1; i++) {
        //         newarr[i] = arr[i+1];
        //     }
        //     for (int i = 0; i < len; i++) {
        //         arr[i] = newarr[i];
        //     }
        // }
        // Ques_9 obj = new Ques_9();
        // obj.printArray(arr, len);
    }
    
    public void leftRotatebyOne(int arr[], int n) {
        int newarr[] = new int[arr.length];
        int len = n;
        newarr[len-1] = arr[0];
        for (int i = 0; i < len - 1; i++) {
            newarr[i] = arr[i+1];
        }
        Ques_9 obj = new Ques_9();
        obj.printArray(newarr, len);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String [] str = sc.nextLine().trim().split(" ");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        Ques_9 m = new Ques_9();
        m.leftRotatebyOne(num, n);
        sc.close();
    }
}
import java.util.Scanner;

interface Number{
    void cal(int[] arr);
}

class Number_1 implements Number{
    public void cal(int[] arr){
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 1; i < arr.length; i+=2){
            oddSum = oddSum + arr[i-1];
            evenSum = evenSum + arr[i];
        }
        if(oddSum > evenSum){
            for(int i = 0; i < arr.length; i+=2){
                System.out.print(arr[i]);
                if(i == arr.length-2) break;
                System.out.print(" ");
            }
        } else{
            for(int i = 1; i < arr.length; i+=2){
                System.out.print(arr[i]);
                if(i == arr.length-1 ) break;
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0){
            sc.nextLine();
            String str[] = sc.nextLine().trim().split(" ");
            int arr[] = new int[n];
            for(int i = 0; i<str.length; i++){
                arr[i] = Integer.parseInt(str[i]);
            }
            Number_1 obj = new Number_1();
            obj.cal(arr);
        } else {
            System.out.println("Enter valid number");
        }
    }
}

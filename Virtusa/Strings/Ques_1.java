import java.util.*;

class Ques_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str[] = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.nextLine();
        }
        for(int i = 1; i<n; i++){
            String temp = str[i];
            int j = i -1;
            while(j >=0 && temp.length() < str[j].length()){
                str[j+1] = str[j];
                j--;
            }
            str[j+1] = temp;
        }
        for(int i =0; i<n; i++){
            System.out.print(str[i]+" ");
        }
    }
}
